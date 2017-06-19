package com.chenxu.cn.bean;

public class NewsEntity {
private String title;
private String club;
private String time;
private String data;
private int type;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getClub() {
	return club;
}
public void setClub(String club) {
	this.club = club;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public String getData() {
	return data;
}
public void setData(String data) {
	this.data = data;
}
public int getType() {
	return type;
}
public void setType(int type) {
	this.type = type;
}
public NewsEntity(String title, String club, String time, String data, int type) {
	super();
	this.title = title;
	this.club = club;
	this.time = time;
	this.data = data;
	this.type = type;
}
public NewsEntity() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "NewsEntity [title=" + title + ", club=" + club + ", time=" + time
			+ ", data=" + data + ", type=" + type + "]";
}

}
