package com.multi.mvc200;

public class GoogleVO {
	private String work;
	private int percent;
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public int getPercent() {
		return percent;
	}
	public void setPercent(int percent) {
		this.percent = percent;
	}
	@Override
	public String toString() {
		return "GoogleVO [work=" + work + ", percent=" + percent + "]";
	}
}
