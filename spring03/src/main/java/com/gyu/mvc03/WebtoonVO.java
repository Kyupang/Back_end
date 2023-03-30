package com.gyu.mvc03;

public class WebtoonVO {
	private String id;
	private String title;
	private String cartoonist;
	private String star;
	private String img;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCartoonist() {
		return cartoonist;
	}
	public void setCartoonist(String cartoonist) {
		this.cartoonist = cartoonist;
	}
	public String getStar() {
		return star;
	}
	public void setStar(String star) {
		this.star = star;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "WebtoonVO [id=" + id + ", title=" + title + ", cartoonist=" + cartoonist + ", star=" + star + ", img="
				+ img + "]";
	}
	
	 
	
}
