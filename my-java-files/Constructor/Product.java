package com.tka;

public class Product {
	
	
	public Product(int productid,String productname,int price) {
		
		System.out.println(productid);
		System.out.println(productname);
		System.out.println(price);
		
	}

	public static void main(String[] args) {
		 Product p=new Product(205,"Asus",10000);

	}

}
