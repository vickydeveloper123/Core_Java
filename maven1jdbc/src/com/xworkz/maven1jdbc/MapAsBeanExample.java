package com.xworkz.maven1jdbc;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapAsBeanExample {

	
	@Bean
	public HashMap<String,String>friuts()
	{
		HashMap<String,String> map=new HashMap();
		
		map.put("101", "SRI Vignesh");
		map.put("102","Afreen" );
		map.put("103", "Madhu");
		map.put("104", "sneha");
		map.put("105", "Neelesh");
		map.put("106", "Arjun");
		return map;
	}
	
	@Bean
	public TestBean testbean(){
		return new TestBean();
	}
	
	
	private static class TestBean{
		@Autowired
		private Map<String,String> fruits;
		
		@PostConstruct
		
		public void postConstruct()
		{
			System.out.println(fruits);
		}
	}
	
	public static void main(String[] args)
	{
		new AnnotationConfigApplicationContext(MapAsBeanExample.class);
	}
	
	
}
