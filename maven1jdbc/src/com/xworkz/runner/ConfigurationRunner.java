package com.xworkz.runner;


import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.maven1jdbc.ConfigurationSpringsMethod;

public class ConfigurationRunner {

	public static void main(String[] args) {

		String xmlFile = "com/xworkz/maven1jdbc/resource/ConfigurationSpring.xml";

		
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlFile);

		ConfigurationSpringsMethod cgs=applicationContext.getBean(ConfigurationSpringsMethod.class);
		
        ArrayList<String> flowerList = cgs.getFlowerList();
		
		ListIterator<String> lIterator = flowerList.listIterator();
		

        while(lIterator.hasNext()){
              System.out.println(lIterator.next());
        }
        
      
        
        Set<String> trainSet=cgs.getSets();
    	System.out.println(trainSet); 
    	
    	Map<String,String> map=cgs.getMaps();
    	System.out.println(map);
    	
    	Properties properties=cgs.getPros();
    	System.out.println(properties);
    	
        
        
        
	}

		 
}
	

