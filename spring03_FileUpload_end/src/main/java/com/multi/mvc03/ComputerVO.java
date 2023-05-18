package com.multi.mvc03;

public class ComputerVO {

	private int price;
	private int price2;
	private String com;
	private String mouse;
	private int sum;

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice2() {
		return price2;
	}

	public void setPrice2(int price2) {
		this.price2 = price2;
	}

	public String getCom() {
		return com;
	}

	public void setCom(String com) {
		this.com = com;
	}

	public String getMouse() {
		return mouse;
	}

	public void setMouse(String mouse) {
		this.mouse = mouse;
	}

	@Override
	public String toString() {
		return "ComputerVO [price=" + price + ", price2=" + price2 + ", com=" + com + ", mouse=" + mouse + "]";
	}

}
