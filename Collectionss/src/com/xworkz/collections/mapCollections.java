package com.xworkz.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*Create a map of country name and pin code
Create a map of mobile and person name
Create a map of ceo name and company
Create a map of ipl team and captain

1. Add least 15 entries 
2. Loop only keys
2. Loop only values
2. Loop all entries using entrySet
2. Loop using forEach of map
*/
public class mapCollections {
	
	public static void main(String[] args)
	{
		Map<String,Integer> countryDetails=new HashMap<>();
		
		Map<String,String> mobileDetails=new LinkedHashMap<>();
		
		Map<String,String> companyDetails=new Hashtable<>();
		
		Map<String,String> iplDetails=new HashMap<>();


		countryDetails.put("India", 91);
		countryDetails.put("China", 86);
		countryDetails.put("czeh republic", 420);
		countryDetails.put("Denmark",45);
		countryDetails.put("Egypt",20);
		countryDetails.put("Finland",358);
		countryDetails.put("France",33);
		countryDetails.put("Germany",49);
		countryDetails.put("GreenLand",299);
		countryDetails.put("HongKong",252);
		countryDetails.put("IceLand", 354);
		countryDetails.put("Indonesia", 62);
		countryDetails.put("Jamaica", 1-876);
		countryDetails.put("Japan",81 );
		countryDetails.put("Kenya", 254);
		countryDetails.put("Kuwait", 965);
		

		
		mobileDetails.put("oppo", "SriVignesh");
		mobileDetails.put("Motorolla", "DORA");
		mobileDetails.put("viva", "Vignesh");
		mobileDetails.put("Reliance", "MallikarjunaRao");
		mobileDetails.put("jio", "UmaMaheswari");
		mobileDetails.put("RealMe", "VijayaDurga");
		mobileDetails.put("Redme", "Varadarajulu");
		mobileDetails.put("Oneplus", "Vivekananda");
		mobileDetails.put("Pocco", "Karthik");
		mobileDetails.put("Apple", "Giridhar");
		mobileDetails.put("Zebronics", "Latha");
		mobileDetails.put("Xiami", "RaviKiran");
		mobileDetails.put("Iqoo", "Sujatha");
		mobileDetails.put("Samsung", "SasiKala");
		mobileDetails.put("Starlite", "Sreedhar");

		
		
		
	
        companyDetails.put("SriVignesh", "Google");
		companyDetails.put("VijayaDurga", "Microsoft");
		companyDetails.put("Accenture ", "Julie Sweet");
		companyDetails.put("Aditya Birla Group", "Kumar Mangalam Birla");
		companyDetails.put("Kumar Mangalam ", "Birla");
		companyDetails.put("AT&T", "John Stankey");
		companyDetails.put("Apple", "Tim Cook");
		companyDetails.put("Boeing", "Dave Calhoun");
		companyDetails.put("Cisco Systems", "Chuck Robbins");
		companyDetails.put("Coca-Cola", "James Quincey");
		companyDetails.put("SriVignesh", "Google");
		companyDetails.put("Dell", "Michael Dell");
		companyDetails.put("Ericsson", "Börje Ekholm");
		companyDetails.put("Facebook", "Mark Zuckerberg");
		companyDetails.put("FedEx", "Frederick W. Smith");

		
		
		iplDetails.put("ChennaiSuperKings","MS DHONI");
		iplDetails.put("Mumbai Indians","Rohit Sharma");
		iplDetails.put("Royal Challengers Bangalore","Faf du Plessis");
		iplDetails.put("Delhi Capitals","MS DHONI");
		iplDetails.put("ChennaiSuperKings","Rishabh Pant");
		iplDetails.put("Kolkata Knight Riders","Shreyas Iyer");
		iplDetails.put("Rajasthan Royals","Sanju Samson");
		iplDetails.put("Punjab Kings","Mayank Agarwal");
		iplDetails.put("Sunrisers Hyderabad	","Kane Williamson");
		iplDetails.put("Lucknow Super Giants","KL Rahul");
		iplDetails.put("Gujarat Titans","Hardik Pandya");
		iplDetails.put("Chennai Super Kings","Ravindra Jadeja");
		iplDetails.put("Punjab Kings","Mayank Agarwal");
		iplDetails.put("Lucknow Super Giants","KL Rahul");
		iplDetails.put("Gujarat Titans","Hardik Pandya");
		
		Set<String> keys=countryDetails.keySet();
		keys.forEach(cuntryDetails->System.out.println(countryDetails));
		
		Set<String> keys1=mobileDetails.keySet();
		keys1.forEach(key->System.out.println(keys1));
		
		Set<String> keys2=companyDetails.keySet();
		keys1.forEach(key->System.out.println(keys2));
		
		Set<String> keys3=iplDetails.keySet();
		keys1.forEach(key->System.out.println(keys3));
		
		Collection<Integer> values=countryDetails.values();
		values.forEach(integervalues->System.out.println(values));
		
		Collection<String> values1=mobileDetails.values();
		values.forEach(integervalues->System.out.println(values1));
		
		Collection<String> values2=companyDetails.values();
		values.forEach(integervalues->System.out.println(values2));
		
		Collection<String> values3=iplDetails.values();
		values.forEach(integervalues->System.out.println(values3));
		
		System.out.println("===============================================================================================================");
		System.out.println("===========================Entry Set for country details================================ ");
		
		
		Set<Entry<String,Integer>> entryset1=countryDetails.entrySet();
		for (Entry<String, Integer> entry : entryset1) {
			
			String keyvalesofCountry=entry.getKey();
			Integer valuesforCountry=entry.getValue();
			
			System.out.println("CountryDetails key "+"="+keyvalesofCountry+"     " +"CountryDetails values"+"="+valuesforCountry);
		}
		
		System.out.println("===================================================================================");
		System.out.println("===========================Entry Set for mobile details================================ ");
		Set<Entry<String,String>> entryset2=mobileDetails.entrySet();
		for (Entry<String, String> entry : entryset2) {
			
		String mobileDetailsKey=entry.getKey();
		String mobileDetailsValues=entry.getValue();
		
		
		System.out.println("Mobile Details Key "+"=="+mobileDetailsKey+"      "+"MobileDetailValues"+"="+mobileDetailsValues);
		
		System.out.println("===================================================================================");
		System.out.println("===========================Entry Set for company details================================ ");
		
		Set<Entry<String,String>> entryset3=companyDetails.entrySet();
		
		for (Entry<String, String> entry2 : entryset3) {
			
			
			String companyDeatailsKey=entry2.getKey();
			String companyDetailsValue=entry2.getValue();
			
			System.out.println("Key Company Details"+"==>"+companyDeatailsKey+"       "+"Value company details"+"=====>"+companyDetailsValue);
		}
		
		

		System.out.println("===================================================================================");
		System.out.println("===========================Entry Set for company details================================ ");
		Set<Entry<String,String>> entryset4=iplDetails.entrySet();
		
		for (Entry<String, String> entry2 : entryset4) {
			
			String iplkey  =entry2.getKey();
	        String iplValue=entry2.getValue();
	        
	        System.out.println("ipl key details"+"======>"+iplkey+"ipl value details"+"======>"+iplValue);
			
		}
		
		
		
		
		System.out.println("===================================================================================");
		
		
		
		System.out.println("===================================================================================");
		System.out.println("forEach method for country details");
		countryDetails.forEach((k,v)->System.out.println(k+"=====>"+v));
		
		System.out.println("===================================================================================");
		System.out.println("forEach method for mobile details");
		
		
		mobileDetails.forEach((k,v)->System.out.println(k+"=====>"+v));
		
		
		System.out.println("===================================================================================");
		System.out.println("forEach method for company details");
		companyDetails.forEach((k,v)->System.out.println(k+"=====>"+v));
		
		System.out.println("===================================================================================");
		System.out.println("forEach method for ipl details");
		
		iplDetails.forEach((k,v)->System.out.println(k+"=====>"+v));
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
	}
	
	

}
