package com.chenxu.cn.bean;

public class UserEntity {
private String stuid;
private String password;
private String identity;
public String getStuid() {
	return stuid;
}
public void setStuid(String stuid) {
	this.stuid = stuid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getIdentity() {
	return identity;
}
public void setIdentity(String identity) {
	this.identity = identity;
}
public UserEntity(String stuid, String password, String identity) {
	super();
	this.stuid = stuid;
	this.password = password;
	this.identity = identity;
}
@Override
public String toString() {
	return "UserEntity [stuid=" + stuid + ", password=" + password
			+ ", identity=" + identity + "]";
}
public UserEntity() {
	super();
	// TODO Auto-generated constructor stub
}


}
