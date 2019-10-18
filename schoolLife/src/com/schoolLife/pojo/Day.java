package com.schoolLife.pojo;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;
public class Day implements Serializable {
     private String dayId;
     private String title;
     private String content;
     private Integer content_id;    
     private String img_url;  
     private Integer img_urlID;  
     private String dayTime;
	public Day() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDayId() {
		return dayId;
	}
	public void setDayId(String dayId) {
		this.dayId = dayId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getContent_id() {
		return content_id;
	}
	public void setContent_id(Integer content_id) {
		this.content_id = content_id;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	public Integer getImg_urlID() {
		return img_urlID;
	}
	public void setImg_urlID(Integer img_urlID) {
		this.img_urlID = img_urlID;
	}
	public String getDayTime() {
		return dayTime;
	}
	public void setDayTime(String dayTime) {
		this.dayTime = dayTime;
	}
	@Override
	public String toString() {
		return "Day [dayId=" + dayId + ", title=" + title + ", content=" + content + ", content_id=" + content_id
				+ ", img_url=" + img_url + ", img_urlID=" + img_urlID + ", dayTime=" + dayTime + "]";
	}

	
}