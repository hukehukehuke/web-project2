package com.schoolLife.pojo;

public class Dianzan {
	
	private String userId;
	private String userYeMianId;
	private int userDianzan;  //µãÔÞ´ÎÊý
	private String starTime;
	public Dianzan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserYeMianId() {
		return userYeMianId;
	}
	public void setUserYeMianId(String userYeMianId) {
		this.userYeMianId = userYeMianId;
	}
	public int getUserDianzan() {
		return userDianzan;
	}
	public void setUserDianzan(int userDianzan) {
		this.userDianzan = userDianzan;
	}
	public String getStarTime() {
		return starTime;
	}
	public void setStarTime(String starTime) {
		this.starTime = starTime;
	}
	@Override
	public String toString() {
		return "Dianzan [userId=" + userId + ", userYeMianId=" + userYeMianId + ", userDianzan=" + userDianzan
				+ ", starTime=" + starTime + "]";
	}
	public Dianzan(String userId, String userYeMianId, int userDianzan, String starTime) {
		super();
		this.userId = userId;
		this.userYeMianId = userYeMianId;
		this.userDianzan = userDianzan;
		this.starTime = starTime;
	}
	
}
