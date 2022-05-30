package com.xworkz.maven1jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ConfigurationSpringsMethod {



	private ArrayList<String> flowerList;
	private Set<String> sets;
	private Map<String, String> maps;
	private Properties pros;

	public ConfigurationSpringsMethod() {
		System.out.println("Default constructor" + this.getClass().getSimpleName());
	}
	
	public ArrayList<String> getFlowerList() {
		return flowerList;
	}
	
	public Map<String, String> getMaps() {
		return maps;
	}
	
	
	public Properties getPros() {
		return pros;
	}
	
	public Set<String> getSets() {
		return sets;
	}
	
	public void setFlowerList(ArrayList<String> flowerList) {
		this.flowerList = flowerList;
	}
	
	
	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}
	
	
	public void setPros(Properties pros) {
		this.pros = pros;
	}
	
	
	public void setSets(Set<String> sets) {
		this.sets = sets;
	}
	


	
}
