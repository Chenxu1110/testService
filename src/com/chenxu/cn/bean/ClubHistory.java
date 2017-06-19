package com.chenxu.cn.bean;

public class ClubHistory {
private String data;

public String getData() {
	return data;
}

public void setData(String data) {
	this.data = data;
}

@Override
public String toString() {
	return "ClubHistory [data=" + data + "]";
}

public ClubHistory(String data) {
	super();
	this.data = data;
}

public ClubHistory() {
	super();
	// TODO Auto-generated constructor stub
}

}
