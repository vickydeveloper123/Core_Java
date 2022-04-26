package com.xworkz.interfaces.dto;

public class PoliticalPartyDTO {
	
	
	private int id;
	private String name;
	private String presidentName;
	private String nationalParty;
	private int noOfMps;
	
	public PoliticalPartyDTO() {

	System.out.println("Default PoliticalPartyDTO constructor"+this.getClass().getSimpleName());
	
	}

	public PoliticalPartyDTO(int id, String name, String presidentName, String nationalParty, int noOfMps) {
		super();
		this.id = id;
		this.name = name;
		this.presidentName = presidentName;
		this.nationalParty = nationalParty;
		this.noOfMps = noOfMps;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		
		if(id>=0)
		{
			System.out.println("Id is found "+id);
			return;
			
		}
		else
		{
			System.err.println("Id is not found in the list");
		}
		this.id = id;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name.length()>=3 && name.length()<50 && name!="@")
		{
			System.out.println("Name is found"+name);
			return;
		}
		else
		{
			System.err.println("Name not founded in the list");
		}
		
		
		this.name = name;
	}

	public String getPresidentName() {
		return presidentName;
	}

	public void setPresidentName(String presidentName) {
		
		if(presidentName.length()>=3 && presidentName.length()<=50 && presidentName!="@")
		{
			System.out.println("president name found in the list"+presidentName);
			return;
		}
		else
		{
			System.out.println("President name not founded in the list"+presidentName);
		}
		
		this.presidentName = presidentName;
	}

	public String getNationalParty() {
		return nationalParty;
	}

	public void setNationalParty(String nationalParty) {
		this.nationalParty = nationalParty;
	}

	public int getNoOfMps() {
		return noOfMps;
	}

	public void setNoOfMps(int noOfMps) {
		this.noOfMps = noOfMps;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nationalParty == null) ? 0 : nationalParty.hashCode());
		result = prime * result + noOfMps;
		result = prime * result + ((presidentName == null) ? 0 : presidentName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PoliticalPartyDTO other = (PoliticalPartyDTO) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nationalParty == null) {
			if (other.nationalParty != null)
				return false;
		} else if (!nationalParty.equals(other.nationalParty))
			return false;
		if (noOfMps != other.noOfMps)
			return false;
		if (presidentName == null) {
			if (other.presidentName != null)
				return false;
		} else if (!presidentName.equals(other.presidentName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PoliticalPartyDTO [id=" + id + ", name=" + name + ", presidentName=" + presidentName
				+ ", nationalParty=" + nationalParty + ", noOfMaps=" + noOfMps + "]";
	}
	

	
	
	
	
}
