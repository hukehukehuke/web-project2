package com.schoolLife.pojo;

public class Pinlun {
   private String puserId;
   private String plYeMianId;
   private String plContent;
   private String plunTime;
public Pinlun() {
	super();
	// TODO Auto-generated constructor stub
}
public String getPuserId() {
	return puserId;
}
public void setPuserId(String puserId) {
	this.puserId = puserId;
}
public String getPlYeMianId() {
	return plYeMianId;
}
public void setPlYeMianId(String plYeMianId) {
	this.plYeMianId = plYeMianId;
}
public String getPlContent() {
	return plContent;
}
public void setPlContent(String plContent) {
	this.plContent = plContent;
}
public String getPlunTime() {
	return plunTime;
}
public void setPlunTime(String plunTime) {
	this.plunTime = plunTime;
}
public Pinlun(String puserId, String plYeMianId, String plContent, String plunTime) {
	super();
	this.puserId = puserId;
	this.plYeMianId = plYeMianId;
	this.plContent = plContent;
	this.plunTime = plunTime;
}
@Override
public String toString() {
	return "Pinlun [puserId=" + puserId + ", plYeMianId=" + plYeMianId + ", plContent=" + plContent + ", plunTime="
			+ plunTime + "]";
}
   
}
