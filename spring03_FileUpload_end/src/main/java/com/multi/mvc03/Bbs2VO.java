package com.multi.mvc03;

//lombok라이브러리

public class Bbs2VO {

	private String bbs_id;
	private String title;
	private String writer;
	private String content;
	private String file_name;
	
	public String getBbs_id() {
		return bbs_id;
	}
	public void setBbs_id(String bbs_id) {
		this.bbs_id = bbs_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	@Override
	public String toString() {
		return "Bbs2VO [bbs_id=" + bbs_id + ", title=" + title + ", writer=" + writer + ", content=" + content
				+ ", file_name=" + file_name + "]";
	}
}
