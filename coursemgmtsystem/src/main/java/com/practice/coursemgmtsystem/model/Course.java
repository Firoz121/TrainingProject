package com.practice.coursemgmtsystem.model;

public class Course {
 private Integer id;
 
 private Integer userid;
 
 
 private String title;
 
 private Integer duration;
 
 private String desecription;
 
 private Integer status;
 
 public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}


public Integer getUserid() {
	return userid;
}

public void setUserid(Integer userid) {
	this.userid = userid;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public Integer getDuration() {
	return duration;
}

public void setDuration(Integer duration) {
	this.duration = duration;
}

public String getDesecription() {
	return desecription;
}

public void setDesecription(String desecription) {
	this.desecription = desecription;
}

public Integer getStatus() {
	return status;
}

public void setStatus(Integer status) {
	this.status = status;
}


 
 
}
