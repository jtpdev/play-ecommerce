package utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import models.Price;
import models.Product;
import models.Special;
import vos.ProductCartVO;
import vos.ProductVO;

public class ProductUtil {
	
	public static BigDecimal getPrice(Product product) {
		final Date today = new Date();
		if (product.getSpecials() != null && !product.getSpecials().isEmpty() && !product.getSpecials().contains(null)) {
			for (Special special : product.getSpecials()) {
				if(special.getDateStart().compareTo(today) <= 0
						&& (special.getDateFinish() == null || special.getDateFinish().compareTo(today) >= 0)){
					return special.getPriceValue();
				}
			}
		}
		for (Price price : product.getPricing()) {
			if(price.getDateStart().compareTo(today) <= 0
					&& (price.getDateFinish() == null || price.getDateFinish().compareTo(today) >= 0)){
				return price.getPriceValue();
			}
		}
		return null;
	}
	public static BigDecimal getPrice(ProductVO product) {
		if (product.getSpecial() != null) {
				return product.getSpecial();
		}
		return product.getPrice();
	}
	
	public static List<ProductCartVO> getProductsVO(List<ProductVO> products) {
		Map<Long,Long> values = 
			    products.stream()
			           .collect(Collectors.groupingBy(ProductVO::getId,Collectors.counting()));
		
		List<ProductCartVO> productsVO = new ArrayList<>();
		for (Entry<Long, Long> value : values.entrySet()) {
			ProductCartVO productCartVO = new ProductCartVO();
			ProductVO product = products.stream().filter(p -> p.getId() == value.getKey()).collect(Collectors.toList()).get(0);
			productCartVO.setProduct(product);
			productCartVO.setQuantity(value.getValue());
			productCartVO.setValue(ProductUtil.getPrice(product).multiply(BigDecimal.valueOf(value.getValue())));
			productsVO.add(productCartVO);
			
		}
		
		return productsVO;
	}

}
