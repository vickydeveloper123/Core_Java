package com.xworkz.expenditure.dto;

public class ExpenditureDTO {
	
	private double amount;
	private double tax;
	private ExpenditurePeriod expenditurePeriod;
	private String spentOn;
	private String personName;
	
	
	public ExpenditureDTO() {

          System.out.println("Created dto");
          
		 
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public double getTax() {
		return tax;
	}


	public void setTax(double tax) {
		this.tax = tax;
	}


	public ExpenditurePeriod getExpenditurePeriod() {
		return expenditurePeriod;
	}


	public void setExpenditurePeriod(ExpenditurePeriod expenditurePeriod) {
		this.expenditurePeriod = expenditurePeriod;
	}


	public String getSpentOn() {
		return spentOn;
	}


	public void setSpentOn(String spentOn) {
		this.spentOn = spentOn;
	}


	public String getPersonName() {
		return personName;
	}


	public void setPersonName(String personName) {
		this.personName = personName;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((expenditurePeriod == null) ? 0 : expenditurePeriod.hashCode());
		result = prime * result + ((personName == null) ? 0 : personName.hashCode());
		result = prime * result + ((spentOn == null) ? 0 : spentOn.hashCode());
		temp = Double.doubleToLongBits(tax);
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
		ExpenditureDTO other = (ExpenditureDTO) obj;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (expenditurePeriod != other.expenditurePeriod)
			return false;
		if (personName == null) {
			if (other.personName != null)
				return false;
		} else if (!personName.equals(other.personName))
			return false;
		if (spentOn == null) {
			if (other.spentOn != null)
				return false;
		} else if (!spentOn.equals(other.spentOn))
			return false;
		if (Double.doubleToLongBits(tax) != Double.doubleToLongBits(other.tax))
			return false;
		return true;
	}

	
	

	
	
	
	
	
	
	
	
	
	

}
