package com.xworkz.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.xworkz.maven1jdbc.ArrayConfig;

public class ArrayDemo {
    public static void main(String[] args) {
          ApplicationContext context = new FileSystemXmlApplicationContext("ArraySpring.xml");
          ArrayConfig arrayConfig = context.getBean("arrayConfigBean",ArrayConfig.class);
          String countryArray[] = arrayConfig.getCountryArray();
          System.out.println("Country List");
          System.out.println("***************");
          for(String country:countryArray) {
                System.out.println(country);
          }
    }
}