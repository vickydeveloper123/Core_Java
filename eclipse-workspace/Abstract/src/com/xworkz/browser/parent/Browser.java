package com.xworkz.browser.parent;

public  abstract class Browser {
	
	String name="ACT FIBERNET";
	String version="ACT 123";
	String company="ACT";
	
	
	public Browser() {

	System.out.println("DEFAULT BROWSER CONSTRUCTOR");
	}
	
	
   @Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}
   
   @Override
protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	super.finalize();
}
   
   @Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
   
   @Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
}
   
   
   
   
   @Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}
   
   
   
   
	
	public Browser(String name, String version, String company) {
		super();
		System.out.println("Parameterised constructor browser");
		this.name = name;
		this.version = version;
		this.company = company;
	}

	public void connect()
	{
		System.out.println("CONNECT METHOD RUNNING IN PARENT CLASS BROWSER ");
	}
	
	public abstract void developerTool(); {
		System.out.println("RUNNING ABSTRACT METHOD DEVELOPER TOOL PARENT CLASS");
		
		
	}
	
	
	public abstract void showTime();
	{
		System.out.println(" Abstract show time in the parent class ");
		
	}
	
	public String getCompany() {
		return company;
	}
	
	public String getName() {
		return name;
	}
	
	
	public String getVersion()
	{
		return version;
	}


	public abstract void cleanUp();
	{
		System.out.println("Clean method from the parent class");
	}


	public abstract void Browser(String string, String string2, String string3);


	public abstract void Browser();


	
	
	
	
	
	
	
	
	
	
	

}
