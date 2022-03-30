package com.xworkz.associations;

public class Hotel {

	private String name="muralikrishna123";
	private int since;
	private Vendor vendor;
	
	public Hotel(Vendor vendor) {
		this.vendor=vendor;
		
	}
	
	public void buyvegetables() {
		

		System.out.println("Invoking Vegetables in the hotel class");
		
		if(this.name!=null) {
			
			String name=this.name.toUpperCase();
			System.out.println(name);
			
			
		}
		
		
		if(vendor!=null) {
		
			boolean sold=this.vendor.sell();
			if(sold)
			{
				System.out.println("Hotel bought vegetables");
			}
			else {
				System.out.println("Hotel does not have vegetables");
			}
		
		
		
		
	}
	
	
	
	
	
	
	
	}
}
