package com.xworkz.maven1jdbc;

public class HeadSet {
	
	private String brand;
	private String color;
	private int warrenty;
	private long cost;
	

	 HeadSet() {

	System.out.println("Default constructor"+this.getClass().getSimpleName());
	
	
	}
	
	HeadSet(String brand,String color)
	{
		this.brand=brand;
		this.color=color;
	}
	
	HeadSet(int warrenty)
	{
		this.warrenty=warrenty;
	}
	
	HeadSet(long cost)
	{
		this.cost=cost;
	}
	
	
	HeadSet(long cost, int warrenty)
	{
		
		this.cost=cost;
		this.warrenty=warrenty;
	}
	
	
	HeadSet(int warrenty,long cost)
	{
		this.warrenty=warrenty;
		this.cost=cost;
		
	}
	
	HeadSet(int warrenty,long cost,String color)
	{
		this.warrenty=warrenty;
		this.color=color;
		this.cost=cost;
	}
	
	

	HeadSet(int warrenty,long cost,String color,String colour)
	{
		this.warrenty=warrenty;
		this.color=color;
		this.cost=cost;
		this.color=colour;
	}
	
	
	HeadSet(String color)
	{
		this.color=color;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getColor() {
		return color;
	}
	
	public long getCost() {
		return cost;
	}
	
	public int getWarrenty() {
		return warrenty;
	}
	
	
	
	
	
	
	
	

}
