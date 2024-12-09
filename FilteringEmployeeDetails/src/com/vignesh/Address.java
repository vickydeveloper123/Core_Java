package com.vignesh;

public class Address implements Comparable<Address> {

	private String nameOfCity;
	private int pinCode;

	public Address() {

	}

	@Override
	public String toString() {
		return "Address [nameOfCity=" + nameOfCity + ", pinCode=" + pinCode + "]";
	}

	public String getNameOfCity() {
		return nameOfCity;
	}

	public void setNameOfCity(String nameOfCity) {
		this.nameOfCity = nameOfCity;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public Address(String nameOfCity, int pinCode) {
		super();
		this.nameOfCity = nameOfCity;
		this.pinCode = pinCode;
	}

	@Override
	public int compareTo(Address o) {
		return this.getPinCode() - o.getPinCode();
	}

}
