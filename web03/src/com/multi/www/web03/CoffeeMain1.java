package com.multi.www.web03;

public class CoffeeMain1 {

	public static void main(String[] args) {
		Coffee1 coffee= Coffee1.getInstance();
		
		System.out.println(coffee);
		
		Coffee1.coffee = null;
		Coffee1 coffee2 = Coffee1.getInstance();
		System.out.println(coffee2);
	}

}
