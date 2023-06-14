package com.vmc.entity;

import java.io.Serializable;

public class Employee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7664056599516412935L;
	String empId;
	String name;
	String desig ;
	String dept;
	String fromDate ;
	String toDate ;
	String salary ;
	public Employee() {
	}
	public Employee(String empId, String name, String desig, String dept, String fromDate, String toDate,
			String salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.desig = desig;
		this.dept = dept;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.salary = salary;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
}
