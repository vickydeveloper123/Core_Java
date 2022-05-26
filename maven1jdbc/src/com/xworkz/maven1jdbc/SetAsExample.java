package com.xworkz.maven1jdbc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SetAsExample {

	
	@Bean
	public Set<String> fruits()
	{
		return new HashSet<> (Arrays.asList("Apple","Mango","Bannana","Orange","PineApple","StrawBerry","Sapota","Pumpkin"));
	}
	
	
	@Bean
	public TestBean testBean()
	{
		return new TestBean();
	}
	
	public static class TestBean
	{
		@Autowired
		private Set<String> fruits;
		
		@PostConstruct
		public void postConstruct(){
			System.out.println(fruits);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		new AnnotationConfigApplicationContext(SetAsExample.class);
	}
	
	
	
}
