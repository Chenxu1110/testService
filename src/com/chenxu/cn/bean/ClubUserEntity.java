package com.chenxu.cn.bean;

public class ClubUserEntity {
private int id;
private String name;
private String sexy;
private String identity;
private String phone;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSexy() {
	return sexy;
}
public void setSexy(String sexy) {
	this.sexy = sexy;
}
public String getIdentity() {
	return identity;
}
public void setIdentity(String identity) {
	this.identity = identity;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public ClubUserEntity(int id, String name, String sexy, String identity,
		String phone) {
	super();
	this.id = id;
	this.name = name;
	this.sexy = sexy;
	this.identity = identity;
	this.phone = phone;
}
public ClubUserEntity() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "ClubUserEntity [id=" + id + ", name=" + name + ", sexy=" + sexy
			+ ", identity=" + identity + ", phone=" + phone + "]";
}

}
