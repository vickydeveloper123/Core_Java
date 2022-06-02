package com.xworkz.institute.constants;

public enum DBConstants {

	USERNAME("root"), PASSWORD("Vignesh@8368"), URL("jdbc:mysql://localhost:3306/XWORKZ");

	public String value;

	DBConstants(String value) {

		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

}
