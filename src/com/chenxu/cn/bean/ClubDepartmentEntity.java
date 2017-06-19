package com.chenxu.cn.bean;

public class ClubDepartmentEntity {
private int id;
private String department;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public ClubDepartmentEntity(int id, String department) {
	super();
	this.id = id;
	this.department = department;
}
public ClubDepartmentEntity() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "ClubDepartment [id=" + id + ", department=" + department + "]";
}

}
