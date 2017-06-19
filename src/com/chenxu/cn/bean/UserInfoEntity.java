package com.chenxu.cn.bean;

public class UserInfoEntity {
	
	private String userName;
	private String stuid;
	private String identity;//身份
	private String sexy;
	private String age;
	private String sign;//个性签名
	private String department;//系部
	private String profession;//专业
	private String address;//地址

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getStuid() {
		return stuid;
	}
	public void setStuid(String stuid) {
		this.stuid = stuid;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getSexy() {
		return sexy;
	}
	public void setSexy(String sexy) {
		this.sexy = sexy;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public UserInfoEntity( String userName, String stuid,
			String identity, String sexy, String age, String sign,
			String department, String profession, String address) {
		super();
	
		this.userName = userName;
		this.stuid = stuid;
		this.identity = identity;
		this.sexy = sexy;
		this.age = age;
		this.sign = sign;
		this.department = department;
		this.profession = profession;
		this.address = address;
	}

	public UserInfoEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	



}
