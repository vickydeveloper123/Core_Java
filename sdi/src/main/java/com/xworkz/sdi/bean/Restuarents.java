package com.xworkz.sdi.bean;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Restuarents {

	private String name;
	@Autowired
	private bigBasket basket;

	public Restuarents(@Value("DORA SRI VIGNESH") String name) {

		System.out.println("Running Restaurents constructor");
		this.name = name;

	}

	@PostConstruct // Here spring will auto-matically call this method because of the post construct.
	public void displayHotelDetails() {
		System.out.println("running displayHotelDetails method");
		System.out.println(this.name);
		System.out.println(this.basket.getId());
		System.out.println(this.basket.getCity());
	}

}
