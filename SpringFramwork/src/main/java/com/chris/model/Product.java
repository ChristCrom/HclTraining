package com.chris.model;
import lombok.Data;
@Data
public class Product {
	private String prdName;
	private String prdPrice;
public void getProductDetails() {
	
	System.out.println("the product name is "+ prdName + " the product price is : " + prdPrice);
}
}
