package com.multi.mvc600;

public class MusicVO {
	private int no;
	private String title;
	private String musician;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMusician() {
		return musician;
	}
	public void setMusician(String musician) {
		this.musician = musician;
	}
	@Override
	public String toString() {
		return "MusicVO [no=" + no + ", title=" + title + ", musician=" + musician + "]";
	}
	
}
