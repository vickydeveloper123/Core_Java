package com.xworkz.shallowclonnindanddeepclonning;

public class Address implements Cloneable {
	
	private String cityname;
	private String state;
	private int pincode;
	
	
	
	
		public Address(String cityname, String state, int pincode) {
		super();
		this.cityname = cityname;
		this.state = state;
		this.pincode = pincode;
	}



	
	
	
	@Override
		protected Address clone() throws CloneNotSupportedException {
			return super.clone();
		}






	@Override
		public String toString() {
			return "Address [cityname=" + cityname + ", state=" + state + ", pincode=" + pincode + "]";
		}






	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	

}
