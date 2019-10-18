package com.schoolLife.pojo;

public class WeiXin {
   private String ip;
   private String openid;
   private String creatTime;
public String getIp() {
	return ip;
}
public void setIp(String ip) {
	this.ip = ip;
}
public String getOpenid() {
	return openid;
}
public void setOpenid(String openid) {
	this.openid = openid;
}
public String getCreatTime() {
	return creatTime;
}
public void setCreatTime(String creatTime) {
	this.creatTime = creatTime;
}
public WeiXin() {
	super();
	// TODO Auto-generated constructor stub
}
public WeiXin(String ip, String openid, String creatTime) {
	super();
	this.ip = ip;
	this.openid = openid;
	this.creatTime = creatTime;
}
@Override
public String toString() {
	return "WeiXin [ip=" + ip + ", openid=" + openid + ", creatTime=" + creatTime + "]";
}

}
