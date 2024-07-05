package com.mayank.bean;

public class profile {
	private String designation;
	private String department;
	private double salary;
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return "profile [Designation : " + designation +" Department : " + department+" Salary : "+salary +"]";
		
	}
	

}
