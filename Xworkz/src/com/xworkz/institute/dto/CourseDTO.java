package com.xworkz.institute.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class CourseDTO {

	private int id;
	private String name;
	private LocalTime duration;
	private float fees;
	private LocalDate startDate;
	private boolean free;

	public CourseDTO(int id, String name, LocalTime duration, float fees, LocalDate startDate, boolean free) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.fees = fees;
		this.startDate = startDate;
		this.free = free;
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

	public LocalTime getDuration() {
		return duration;
	}

	public void setDuration(LocalTime duration) {
		this.duration = duration;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	@Override
	public String toString() {
		return "CourseDTO [id=" + id + ", name=" + name + ", duration=" + duration + ", fees=" + fees + ", startDate="
				+ startDate + ", free=" + free + "]";
	}

}
