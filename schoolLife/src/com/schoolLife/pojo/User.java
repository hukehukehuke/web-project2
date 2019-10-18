package com.schoolLife.pojo;

public class User {
	private String userOpenid;
	private String user_img;
	private String userqianming;
	private String userTime;
	
	public String getUserOpenid() {
		return userOpenid;
	}
	public void setUserOpenid(String userOpenid) {
		this.userOpenid = userOpenid;
	}
	public String getUser_img() {
		return user_img;
	}
	public void setUser_img(String user_img) {
		this.user_img = user_img;
	}
	public String getUserqianming() {
		return userqianming;
	}
	public void setUserqianming(String userqianming) {
		this.userqianming = userqianming;
	}
	public String getUserTime() {
		return userTime;
	}
	public void setUserTime(String userTime) {
		this.userTime = userTime;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userOpenid, String user_img, String userqianming, String userTime) {
		super();
		this.userOpenid = userOpenid;
		this.user_img = user_img;
		this.userqianming = userqianming;
		this.userTime = userTime;
	}
	@Override
	public String toString() {
		return "User [userOpenid=" + userOpenid + ", user_img=" + user_img + ", userqianming=" + userqianming
				+ ", userTime=" + userTime + "]";
	}
	
	
}
