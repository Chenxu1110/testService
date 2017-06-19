package com.chenxu.cn.bean;

import java.sql.Time;

public class NoticeEntity {
private int id;
private String title;
private String club;
private String time;
private String promulgator;
private String data;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
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
public String getPromulgator() {
	return promulgator;
}
public void setPromulgator(String promulgator) {
	this.promulgator = promulgator;
}
public String getData() {
	return data;
}
public void setData(String data) {
	this.data = data;
}
public NoticeEntity(int id, String title, String club, String time,
		String promulgator, String data) {
	super();
	this.id = id;
	this.title = title;
	this.club = club;
	this.time = time;
	this.promulgator = promulgator;
	this.data = data;
}
public NoticeEntity() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "NoticeEntity [id=" + id + ", title=" + title + ", club=" + club
			+ ", time=" + time + ", promulgator=" + promulgator + ", data="
			+ data + "]";
}


}
