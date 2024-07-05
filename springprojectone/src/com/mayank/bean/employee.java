package com.mayank.bean;

public class employee {
	
	private int eid;
	private String name;
	private String city;
	
	/*
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	*/
	public employee(int eid, String name, String city) {
		super();
		this.eid = eid;
		this.name = name;
		this.city = city;
	}

	
	
	public void show() {
		System.out.println(eid + "  " + name + "  " + city + "  " );
		}

	
}
