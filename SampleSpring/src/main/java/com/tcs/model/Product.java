package com.tcs.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
public class Product {

    @Id
    private long id;

    //@Indexed(unique = true)
   // private int productId;
	
	private String name;
	
	private Double price;

   // public void setProductId(int productId){
	//	this.d = productId;
	//}
	public void setProductName(String productName){
		this.name = productName;
	}
	public void set productPrice(Double productPrice){
		this.price = productPrice;
	}
}