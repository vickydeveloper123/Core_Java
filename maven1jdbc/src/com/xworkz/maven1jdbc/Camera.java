package com.xworkz.maven1jdbc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class Camera {

	
	@NonNull
	private String name;
	@NonNull
	private String brandName;

	@NonNull
	private String manufaturedLocation;
	private int noOfItem;
	private double since;
	private String itemColor;
	private int price;

	public Camera() {

		System.out.println("Default constructor of camera");

	}

	Camera(String name, String brandName, String manufacturedLocation) {
		System.out.println("Parameteised Camera constructor");
		this.name = name;
		this.brandName = brandName;
		this.manufaturedLocation = manufacturedLocation;

	}

	public void setNoOfItem(int noOfItem) {
		this.noOfItem = noOfItem;
	}

	public void setSince(double since) {
		this.since = since;
	}

	public void setItemColor(String itemColor) {
		this.itemColor = itemColor;
	}

}
