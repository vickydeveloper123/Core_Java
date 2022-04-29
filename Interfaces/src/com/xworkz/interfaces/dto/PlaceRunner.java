package com.xworkz.interfaces.dto;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PlaceRunner {

	public static void main(String[] args) {
		PlaceDTO placeDTO=new  PlaceDTO(101,"madhu","Mudhol","Karnatak","India");
		PlaceDTO placeDTO1=new  PlaceDTO(102,"vignesh","rajamandry","andhrapradesh","India");
		PlaceDTO placeDTO2=new  PlaceDTO(103,"Neelesh","Badami","Karnatak","India");
		PlaceDTO placeDTO3=new  PlaceDTO(104,"sneha","Banagalore","Karnatak","India");
		PlaceDTO placeDTO4=new  PlaceDTO(105,"karthik","vishakhapatnam","andhrapradesh","India");
		PlaceDTO placeDTO5=new  PlaceDTO(106,"Pooja","hyderabad","telangana","India");
		PlaceDTO placeDTO6=new  PlaceDTO(107,"tamilselva","numbamopakam","chennai","India");
		PlaceDTO placeDTO7=new  PlaceDTO(108,"angel","chittor","andhrapradesh","India");
		PlaceDTO placeDTO8=new  PlaceDTO(109,"MadhuShrii","nellore","andhrapradesh","India");
		PlaceDTO placeDTO9=new  PlaceDTO(110,"Meghachowdary","Mysore","Karnatak","India");
	  
		Set<PlaceDTO>   placeDTOs=new LinkedHashSet<PlaceDTO>();
		placeDTOs.add(placeDTO);
		placeDTOs.add(placeDTO1);
		placeDTOs.add(placeDTO2);
		placeDTOs.add(placeDTO3);
		placeDTOs.add(placeDTO4);
		placeDTOs.add(placeDTO5);
		placeDTOs.add(placeDTO6);
		placeDTOs.add(placeDTO7);
		placeDTOs.add(placeDTO8);
		placeDTOs.add(placeDTO9);
		
		System.out.println(placeDTOs);
		
		System.out.println(placeDTOs.size());
		
	}

}
