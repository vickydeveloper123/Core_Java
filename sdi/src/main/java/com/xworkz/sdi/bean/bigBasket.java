package com.xworkz.sdi.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class bigBasket {

	@Value("NELLORE")
	private String city;
	@Value("123")
	private int id;

	public bigBasket() {

		System.out.println("Running big basket default constructor");

	}

	public String getCity() {
		return city;
	}

	public int getId() {
		return id;
	}

}
