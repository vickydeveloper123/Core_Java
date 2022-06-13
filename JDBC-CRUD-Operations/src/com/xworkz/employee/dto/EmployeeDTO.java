package com.xworkz.employee.dto;
import java.io.Serializable;

public class EmployeeDTO implements Serializable {

	
	    private static final long serialVersionUID = -1280037900360314186L;

	    private int id;
	    private String name;
	    private double phone;
	    private String email;
		
	    
	    public EmployeeDTO(int id, String name, double phone, String email) {
			super();
			this.id = id;
			this.name = name;
			this.phone = phone;
			this.email = email;
		}


		public EmployeeDTO() {
			// TODO Auto-generated constructor stub
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


		public double getPhone() {
			return phone;
		}


		public void setPhone(double phone) {
			this.phone = phone;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public static long getSerialversionuid() {
			return serialVersionUID;
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((email == null) ? 0 : email.hashCode());
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			long temp;
			temp = Double.doubleToLongBits(phone);
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
			EmployeeDTO other = (EmployeeDTO) obj;
			if (email == null) {
				if (other.email != null)
					return false;
			} else if (!email.equals(other.email))
				return false;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (Double.doubleToLongBits(phone) != Double.doubleToLongBits(other.phone))
				return false;
			return true;
		}


		@Override
		public String toString() {
			return "EmployeeDTO [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + "]";
		}
	    
	    

	    
	    
}
	    
	  