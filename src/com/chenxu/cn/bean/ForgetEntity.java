package com.chenxu.cn.bean;

public class ForgetEntity {
	private int id;// 用户id
	private String name;

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

	public ForgetEntity(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public ForgetEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Forget [id=" + id + ", name=" + name + "]";
	}

}
