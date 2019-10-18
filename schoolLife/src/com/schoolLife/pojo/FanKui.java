package com.schoolLife.pojo;

public class FanKui {
    private String fanKuiId;
	private String fanKuiContent;
	private String fanKuiTime;
	public FanKui() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFanKuiId() {
		return fanKuiId;
	}
	public void setFanKuiId(String fanKuiId) {
		this.fanKuiId = fanKuiId;
	}
	public String getFanKuiContent() {
		return fanKuiContent;
	}
	public void setFanKuiContent(String fanKuiContent) {
		this.fanKuiContent = fanKuiContent;
	}
	public String getFanKuiTime() {
		return fanKuiTime;
	}
	public void setFanKuiTime(String fanKuiTime) {
		this.fanKuiTime = fanKuiTime;
	}
	public FanKui(String fanKuiId, String fanKuiContent, String fanKuiTime) {
		super();
		this.fanKuiId = fanKuiId;
		this.fanKuiContent = fanKuiContent;
		this.fanKuiTime = fanKuiTime;
	}
	@Override
	public String toString() {
		return "FanKui [fanKuiId=" + fanKuiId + ", fanKuiContent=" + fanKuiContent + ", fanKuiTime=" + fanKuiTime + "]";
	}
	
}
