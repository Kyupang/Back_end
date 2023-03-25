package com.multi.www.web03;

public class Car2 {
	//멤버변수
	//멤버메서드
	//toString()
	//객체생성시 멤버변수값을 한꺼번에 넣어서 초기화하세요
	//->객체생성시 자동호출되는 메서드를 추가해주세요
	//->생성자(메서드), constructor
	
	String color;
	int price;
	int speed;
	static Car2 car2;
	
	//싱글톤방법 
	public static Car2 getInstance() {
		if(car2 ==null) {
			car2 = new Car2("빨강",1000,1010);
		}
		return car2;
	}
	
	public void run() {
		System.out.println("달리자~.");
	}
	
	private Car2(String color, int price, int speed) {
		this.color = color;
		this.price = price;
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", price=" + price + ", speed=" + speed + "]";
	}
	
	

}
