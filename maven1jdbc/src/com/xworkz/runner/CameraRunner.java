package com.xworkz.runner;

import com.xworkz.maven1jdbc.Camera;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CameraRunner {
	
	
	public static void main(String[] args)
	{
		
		String xmlfile="/maven1jdbc/src/com/xworkz/maven1jdbc/resource/SpringCamera.xml";
		ApplicationContext  applicationContext=new ClassPathXmlApplicationContext(xmlfile);
		
		 Camera cameraDTO = applicationContext.getBean(Camera.class);
	        System.out.println(cameraDTO);
	        
	       Integer integer= applicationContext.getBean(Integer.class);
		
	       System.out.println(integer);
	       
	       
	        Double doubleNum = applicationContext.getBean(Double.class);
	        System.out.println(doubleNum);
	       
	        Boolean booleanVal = applicationContext.getBean(Boolean.class);
	        System.out.println(booleanVal);
	        
	        Character charectervalue=applicationContext.getBean(Character.class);
	        System.out.println(charectervalue);
	        

	        Character charVal = applicationContext.getBean(Character.class);
	        System.out.println(charVal);

	        Float floatVal = applicationContext.getBean(Float.class);
	        System.out.println(floatVal);

	        BigDecimal bigDecimalVal = applicationContext.getBean(BigDecimal.class);
	        System.out.println(bigDecimalVal);

	        StringBuffer str1 = applicationContext.getBean("1", StringBuffer.class);
	        System.out.println(str1);

	        StringBuffer str2 = applicationContext.getBean("2", StringBuffer.class);
	        System.out.println(str2.capacity());

	        StringBuffer str3 = applicationContext.getBean("3", StringBuffer.class);
	        System.out.println(str3);
	       
	       
		
		
		
		
	}

}
