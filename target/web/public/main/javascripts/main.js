var app = angular.module('lucy', [], function($locationProvider){
    $locationProvider.html5Mode(true);
});
app.controller('HeaderController', function($scope, $http, $rootScope, $location) {
	$scope.loginuri =  '/login/' + $location.path().replace(/\//g, "|");
	$http.get('/categories').then(function (response) {
	      $scope.categories = response.data;
	  });
	$http.get('/logged').then(function (response) {
		$scope.logged = response.data;
	});
	$http.get('/cart/total').then(function (response) {
		$rootScope.total = response.data.total;
	});
	
	$scope.expand = function(){
		angular.element('#categories').toggle(200);
	}
	$scope.custom = true;
    $scope.toggleCustom = function() {
        $scope.custom = $scope.custom === false ? true: false;
    };
});
app.controller('ProductController', function($scope, $http, $rootScope) {
	$http.get('/specials').then(function (response) {
		$scope.specials = response.data;
	});
	$scope.toCart = function(product_id) {
		$http.get('/cart/add/' + product_id).then(function (response) {
			$rootScope.total = response.data.total;
		});
	}
});
app.controller('CategoryController', function($scope, $http, $rootScope, $sce, $filter) {
	$http.get('/products').then(function (response) {
		$scope.products = response.data;
	});
	$scope.toCart = function(product_id) {
		$http.get('/cart/add/' + product_id).then(function (response) {
			$rootScope.total = response.data.total;
		});
	}
	$scope.values = function(pold, pnew) {
		var value = "<span class=\"price-old\">" + $filter('currency')(pold)
				+ "</span> - <span class=\"price-new\">"
				+ $filter('currency')(pnew) + "</span>";
		if (!pnew | pnew == "") {
			var value = "<span class=\"price-new\">"
					+ $filter('currency')(pold) + "</span>";
		}
		return $sce.trustAsHtml(value);
	}
});
app.controller('CartController', function($scope, $http, $rootScope) {
	$http.get('/sale').then(function (response) {
		$scope.products = response.data;
	});
	$http.get('/shipping').then(function (response) {
		$scope.shippings = response.data;
	});
	$http.get('/cart/total').then(function (response) {
		$scope.shippingValue = response.data.shippingValue;
		$scope.subTotal = response.data.subTotal;
		$scope.cart = response.data;
	});
	$scope.addQuantity = function($index, qtd){
		if(qtd){
			var id =$scope.products[$index].product.id;
			$http.get('/cart/' + id + '/add/' + qtd).then(function (response) {
				for(i = 0; i < response.data.length; i++){
					if(response.data[i].product.id == id){
						$scope.products[$index].value = response.data[i].value;
					}
				}
				$http.get('/cart/total').then(function (response) {
					$scope.shippingValue = response.data.shippingValue;
					$scope.subTotal = response.data.subTotal;
					$rootScope.total = response.data.total;
				});
			});
		}
			
	}
	$scope.add = function($index){
		var id =$scope.products[$index].product.id;
		$http.get('/cart/plus/' + id).then(function (response) {
			for(i = 0; i < response.data.length; i++){
				if(response.data[i].product.id == id){
					$scope.products[$index].value = response.data[i].value;
					$scope.products[$index].quantity = response.data[i].quantity;
				}
			}
			$http.get('/cart/total').then(function (response) {
				$scope.shippingValue = response.data.shippingValue;
				$scope.subTotal = response.data.subTotal;
				$rootScope.total = response.data.total;
			});
		});
	}
	$scope.remove = function($index){
		var id =$scope.products[$index].product.id;
		if($scope.products[$index].quantity == 1){
			$scope.removeAll($index);
		}
		$http.get('/cart/remove/' + id).then(function (response) {
			for(i = 0; i < response.data.length; i++){
				if(response.data[i].product.id == id){
					$scope.products[$index].value = response.data[i].value;
					$scope.products[$index].quantity = response.data[i].quantity;
				}
			}
			$http.get('/cart/total').then(function (response) {
				$scope.shippingValue = response.data.shippingValue;
				$scope.subTotal = response.data.subTotal;
				$rootScope.total = response.data.total;
			});
		});
	}
	$scope.removeAll = function($index){
		var id =$scope.products[$index].product.id;
		$http.get('/cart/removeall/' + id).then(function (response) {
			$scope.products.splice($index, 1);
			$http.get('/cart/total').then(function (response) {
				$scope.shippingValue = response.data.shippingValue;
				$scope.subTotal = response.data.subTotal;
				$rootScope.total = response.data.total;
			});
		});
	}
	
	$scope.$watch('cart.shipping.id', function(value) {
		$http.get('/shipping/add/' + value).then(function (response) {
			$scope.shippingValue = response.data.shippingValue;
			$scope.subTotal = response.data.subTotal;
			$rootScope.total = response.data.total;
		});
	 });
	
});
app.controller('UserController', function($scope, $http, $rootScope, $sce, $filter) {
	$scope.loginmessage = "";
	$http.get('/logeduser').then(function (response) {
		$scope.user = response.data;
	});
	$http.get('/uri').then(function (response) {
		$scope.uri = response.data;
	});
	
	$scope.doLogin = function(){
		$http.get('/dologin/' + $scope.user).then(function (response) {
			$scope.loginmessage = response.data;
		});
	}
	
	$scope.addUser = function(){
		$http.get('/adduser/' + $scope.user).then(function (response) {
			$scope.loginmessage = response.data;
		});
	}
});
