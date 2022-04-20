package com.xworkz.criminals;

public class CriminalDTO {
	
	String id;
	String name;
	double offense;
	int imprisonment;
	String jailName;
	
	
	public CriminalDTO() {

	System.out.println("Default constructor from criminal dto");
	
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getOffense() {
		return offense;
	}


	public void setOffense(double offense) {
		this.offense = offense;
	}


	public int getImprisonment() {
		return imprisonment;
	}


	public void setImprisonment(int imprisonment) {
		this.imprisonment = imprisonment;
	}


	public String getJailName() {
		return jailName;
	}


	public void setJailName(String jailName) {
		this.jailName = jailName;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + imprisonment;
		result = prime * result + ((jailName == null) ? 0 : jailName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(offense);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		CriminalDTO other = (CriminalDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (imprisonment != other.imprisonment)
			return false;
		if (jailName == null) {
			if (other.jailName != null)
				return false;
		} else if (!jailName.equals(other.jailName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(offense) != Double.doubleToLongBits(other.offense))
			return false;
		return true;
	}
	
	
	
	
	

}
