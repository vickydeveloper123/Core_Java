package com.vignesh;

public class Employers {
	
	private String name;
	private Double Salary;
	private Address address;
	private int Age;
	
	public Employers() {
	}

	public Employers(String name, Double salary, Address address, int age) {
		super();
		this.name = name;
		Salary = salary;
		this.address = address;
		Age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	@Override
	public String toString() {
		return "Employers [name=" + name + ", Salary=" + Salary + ", address=" + address + ", Age=" + Age + "]";
	}

	

}
