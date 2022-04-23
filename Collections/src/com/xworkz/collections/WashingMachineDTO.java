package com.xworkz.collections;

public class WashingMachineDTO {
	
	
	private int id;
	private String brand;
	private double capacity;
	private Colour colour;
	private int price;
	private double modelNo;
	
	public WashingMachineDTO() {

		System.out.println("Default constructor of washing machinr DTO");
	}

	public WashingMachineDTO(int id, String brand, double capacity, Colour colour, int price, double modelNo) {
		super();
		this.id = id;
		this.brand = brand;
		this.capacity = capacity;
		this.colour = colour;
		this.price = price;
		this.modelNo = modelNo;
	}

	@Override
	public String toString() {
		return "WashingMachineDTO [id=" + id + ", brand=" + brand + ", capacity=" + capacity + ", colour=" + colour
				+ ", price=" + price + ", modelNo=" + modelNo + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public Colour getColour() {
		return colour;
	}

	public void setColour(Colour colour) {
		this.colour = colour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getModelNo() {
		return modelNo;
	}

	public void setModelNo(double modelNo) {
		this.modelNo = modelNo;
	}
	
	
	

}
