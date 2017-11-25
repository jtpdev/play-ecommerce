package utils;

import java.io.Serializable;

//@SessionScoped
public class UriUtil implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String value;
	
	public UriUtil() {
		this.setValue("");
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}
	

}
