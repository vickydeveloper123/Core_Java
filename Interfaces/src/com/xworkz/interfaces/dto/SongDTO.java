package com.xworkz.interfaces.dto;

import java.util.Objects;

public class SongDTO {
	private int id;
	private String name;
	private String singer;
	private String duration;

	@Override
	public int hashCode() {
		System.out.println(" hash code");
		int superHascode=super.hashCode();
		System.out.println(superHascode);
		
		return superHascode;
	}
	
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		System.out.println(" equals method");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SongDTO other = (SongDTO) obj;
		return Objects.equals(name, other.name) && Objects.equals(singer, other.singer);
	}
	
	
	
	
	public SongDTO(int id, String name, String singer, String duration) {
		super();
		this.id = id;
		this.name = name;
		this.singer = singer;
		this.duration = duration;
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
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
	
	
	@Override
	public String toString() {
		return "SongDTO [id=" + id + ", name=" + name + ", singer=" + singer + ", duration=" + duration + "]";
	}
	
	
	

}