package com.xworkz.collections.Runner;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.collections.dto.FoodItemDTO;
import com.xworkz.collections.dto.Type;

/*1. Loop all items and display 
2. Loop and filter items by non veg type and display
3.Loop and filter where price is greater than 50 and display 
4. Loop and filter where price is greater than 50 and get only hotel names
5. Loop and filter where price is greater than 50 and get only hotel names sorted 
5. Loop and get name sorted
6. Loop and get only ids sorted in desc
7. Loop and get name where hotel name 
8. Loop and filter items by  veg type and sort desc 
9. Loop and sort 
10. Loop and sort desc
11. Loop and get only name in upper case
12. Loop and get only hotel name in upper case*/


public class FoodItemRunner {
	
	public static void main(String[] args) {
	
	List<FoodItemDTO> fooditem=new LinkedList<FoodItemDTO>();
	
	
	
	FoodItemDTO fooditems1=new FoodItemDTO(101,"Biryani",150,1.0,Type.Non_Vegeterian,"Rayalseema");
	FoodItemDTO fooditems2=new FoodItemDTO(102,"Chicken Biryani",250,2.0,Type.Non_Vegeterian,"Rayalseema");
	FoodItemDTO fooditems3=new FoodItemDTO(103,"Mutton Biryani",350,3.0,Type.Non_Vegeterian,"Murali krishna");
	FoodItemDTO fooditems4=new FoodItemDTO(104,"France Biryani",250,4.0,Type.Non_Vegeterian,"Murali Krishna");
	FoodItemDTO fooditems5=new FoodItemDTO(105,"Sada Biryani",120,1.3,Type.Vegeterian,"RIYAZ");
	FoodItemDTO fooditems6=new FoodItemDTO(106,"Egg Biryani",100,2.0,Type.Vegeterian,"A2B");
	FoodItemDTO fooditems7=new FoodItemDTO(107,"Sambar Rice",110,1.0,Type.Vegeterian,"Siri Vennala");
	FoodItemDTO fooditems8=new FoodItemDTO(108,"Curd Rice",50,5.0,Type.Vegeterian,"Komal Vilas");
	FoodItemDTO fooditems9=new FoodItemDTO(109,"Tamato Rice",70,2.0,Type.Vegeterian,"Abiruchulu");
	FoodItemDTO fooditems10=new FoodItemDTO(110,"Lemon Rice",80,5.0,Type.Vegeterian,"Andhra Foods");

 
	fooditem.add(fooditems1);
	fooditem.add(fooditems2);
	fooditem.add(fooditems3);
	fooditem.add(fooditems4);
	fooditem.add(fooditems5);
	fooditem.add(fooditems6);
	fooditem.add(fooditems7);
	fooditem.add(fooditems8);
	fooditem.add(fooditems9);
	fooditem.add(fooditems10);
	
	
	System.out.println(fooditem.size());
	
	System.out.println("------------------------------------");
	
	
	
	
	fooditem.stream()
	.collect(Collectors.toSet())
	.forEach(foooditem->System.out.println(fooditem));
	
	
	System.out.println("=========================================");
	
	
	System.out.println("Loop and filter items by non veg type and display");
	
		fooditem.stream()
		.filter(nonveg->nonveg.getType()==Type.NON_VEGETERAIN)
		.collect(Collectors.toList())
	    .forEach(type->System.out.println(type));
		
		
     System.out.println("=========================================================");
	
	

     System.out.println("Loop and filter where price is greater than 50 and display ");
     
     fooditem.stream()
     .filter(price->price.getPrice()>=150)
     .forEach(price->System.out.println(price));
     
     System.out.println("========================================================");
     
     System.out.println("Loop and filter where price is greater than 50 and get only hotel names");
     
     fooditem.stream()
     .filter(price->price.getPrice()>=150)
     .map(hotelName->hotelName.getHotelName())
     .forEach(price->System.out.println(price));
     
     System.out.println("=============================================================");
     
     
     System.out.println("Loop and filter where price is greater than 50 and get only hotel names sorted ");
     fooditem.stream()
     .filter(price->price.getPrice()>=150)
     .map(hotelName->hotelName.getHotelName())
     .sorted()
     .forEach(priceandSortedHotelNames->System.out.println(priceandSortedHotelNames));
     
     System.out.println("================================================================");
     
     
     System.out.println("Loop and get name sorted");
     
     fooditem.stream()
     .map(hotelName->hotelName.getHotelName())
     .sorted()
     .forEach(hotelNames->System.out.println(hotelNames));
     
     
     System.out.println("====================================================================");
     
     System.out.println("Loop and get only ids sorted in desc");
     
     fooditem.stream()
     .map(id->id.getId())
     .sorted(Comparator.naturalOrder())
     .sorted(Comparator.reverseOrder())
     .forEach(names->System.out.println(names));
     
     System.out.println("===================================================================");
     
     
     System.out.println("Loop and get name where hotel name ");
     
     fooditem.stream()
     .map(name->name.getHotelName())
     .collect(Collectors.toList())
     .forEach(hotelName->System.out.println(hotelName));
     
     System.out.println("=============================================================");
     
     System.out.println("Loop and filter items by  veg type and sort desc ");
     
     fooditem.stream()
     .map(items->items.getType()==Type.Vegeterian)  
     .sorted(Comparator.reverseOrder())
     .forEach(vegeterianItems->System.out.println(vegeterianItems));
     
     System.out.println("========================================================================");
     
     System.out.println("Loop and sort");
     
     fooditem.stream()
        .map(price->price.getPrice())
        .sorted()
        .forEach(price->System.out.println(price));
     
     System.out.println("=======================================");
     
     
     System.out.println("Loop and sort desc");
     fooditem.stream()
     .map(price->price.getPrice())
     .sorted(Comparator.reverseOrder())
     .forEach(price->System.out.println(price));
     
     System.out.println("====================================");
     
     System.out.println("Loop and get only name in upper case");
     
     fooditem.stream()
     .map(name->name.getName().toUpperCase())
     .forEach(nameinuppercase->System.out.println(nameinuppercase));
     
     System.out.println("=======LOWER CASE=======");
     
     fooditem.stream()
     .map(name->name.getName().toLowerCase())
     .forEach(nameinlowercase->System.out.println(nameinlowercase));
     
    System.out.println("==============================================================================");
    
    System.out.println("Loop and get only hotel name in upper case");
    
    fooditem.stream()
    .map(hotelName->hotelName.getHotelName().toUpperCase())
    .forEach(hotelNameToUpperCase->System.out.println(hotelNameToUpperCase));
     
     
     
     
     
	
	}
	
	
}