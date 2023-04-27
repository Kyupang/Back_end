package com.multi.mongoDB;

import java.util.Date;

public class MemoVO {
	private String _id; //_id
	private String name; //작성자이름
	private String content; //작성내용
	private String weather; //작성한 날의 날씨
	private Date date; //작성날짜
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "MemoVO [_id=" + _id + ", name=" + name + ", content=" + content + ", weather=" + weather + ", date="
				+ date + "]";
	}
}
