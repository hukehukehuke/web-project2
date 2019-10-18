package com.schoolLife.pojo;



import org.springframework.web.multipart.MultipartFile;

public class Star {
   private String starId;
   private String star_img;
   private String starTitle;
   private String starContent;
   private String starTime;
   private String starUser_id;
   private MultipartFile file;
public Star() {
	super();
	// TODO Auto-generated constructor stub
}
public String getStarId() {
	return starId;
}
public void setStarId(String starId) {
	this.starId = starId;
}
public String getStar_img() {
	return star_img;
}
public void setStar_img(String star_img) {
	this.star_img = star_img;
}
public String getStarTitle() {
	return starTitle;
}
public void setStarTitle(String starTitle) {
	this.starTitle = starTitle;
}
public String getStarContent() {
	return starContent;
}
public void setStarContent(String starContent) {
	this.starContent = starContent;
}
public String getStarTime() {
	return starTime;
}
public void setStarTime(String starTime) {
	this.starTime = starTime;
}
public String getStarUser_id() {
	return starUser_id;
}
public void setStarUser_id(String starUser_id) {
	this.starUser_id = starUser_id;
}
public MultipartFile getFile() {
	return file;
}
public void setFile(MultipartFile file) {
	this.file = file;
}
public Star(String starId, String star_img, String starTitle, String starContent, String starTime, String starUser_id,
		MultipartFile file) {
	super();
	this.starId = starId;
	this.star_img = star_img;
	this.starTitle = starTitle;
	this.starContent = starContent;
	this.starTime = starTime;
	this.starUser_id = starUser_id;
	this.file = file;
}
@Override
public String toString() {
	return "Star [starId=" + starId + ", star_img=" + star_img + ", starTitle=" + starTitle + ", starContent="
			+ starContent + ", starTime=" + starTime + ", starUser_id=" + starUser_id + ", file=" + file + "]";
}

   

}
