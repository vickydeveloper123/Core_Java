package com.xworkz.dto;

/*Batch: id,courseName,startDate,fees
id>0, courseName not null, not empty,min 3 , max 20 chars,startDate is not null and
 should be future date, fees > 5000
*/



public class XworkzBatchDetails {
	
	private int id;
	private String courseName;
	private String startDate;
	private int fess;
	
	
	
	@Override
	public String toString() {
		return "XworkzBatchDetails [id=" + id + ", courseName=" + courseName + ", startDate=" + startDate + ", fess="
				+ fess + "]";
	}



	public XworkzBatchDetails(int id, String courseName, String startDate, int fess) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.startDate = startDate;
		this.fess = fess;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCourseName() {
		return courseName;
	}



	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}



	public String getStartDate() {
		return startDate;
	}



	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}



	public int getFess() {
		return fess;
	}



	public void setFess(int fess) {
		this.fess = fess;
	}
	
	
	
	

}
