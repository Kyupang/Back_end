package com.multi.www.web03;

public class Coffee1 {
	int price;
	String name;
	
	public static Coffee1 coffee;
	
	public static Coffee1 getInstance() {
		if(coffee == null) {
			coffee = new Coffee1(1000, "아메리카노");
		}
		return coffee;
	}
	
	private Coffee1(int price, String name) {
		this.price = price;
		this.name = name;
	}

	
	
	
	
}
