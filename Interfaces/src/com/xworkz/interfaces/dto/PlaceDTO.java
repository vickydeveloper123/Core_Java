package com.xworkz.interfaces.dto;

import java.util.Objects;

public class PlaceDTO {
      private int id;
      private String name;
      private String city;
      private String state;
      private String country;
      
      
      @Override
  	public int hashCode() {
  		System.out.println("hash code");
  		int superhascode=super.hashCode();
  		System.out.println(superhascode);
  		return superhascode;
  		}
      
      
      
      
  	@Override
  	public boolean equals(Object obj) {
  		if (this == obj)
  			return true;
  		if (obj == null)
  			return false;
  		if (getClass() != obj.getClass())
  			return false;
  		PlaceDTO other = (PlaceDTO) obj;
  		return Objects.equals(city, other.city) && Objects.equals(name, other.name);
  		
  		
  	}





	public PlaceDTO(int id, String name, String city, String state, String country) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "PlaceDTO [id=" + id + ", name=" + name + ", city=" + city + ", state=" + state + ", country=" + country
				+ "]";
	}
	
      
}
