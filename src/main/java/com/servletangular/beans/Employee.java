package com.servletangular.beans;

public class Employee {
	
	private int empId;
	private String name;
	private double salary;
	private String designation;
	private String address;
	
	public Employee() {
		
	}
	/**
	 * @param empId
	 * @param name
	 * @param salary
	 * @param designation
	 * @param address
	 */
	public Employee(int empId, String name, double salary, String designation, String address) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.address = address;
	}
	
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}
