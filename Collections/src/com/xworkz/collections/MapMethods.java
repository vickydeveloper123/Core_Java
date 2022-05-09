package com.xworkz.collections;



import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;

public class MapMethods {

	public static void main(String[] args) {

		Map<String, String> countryCapitalMap = new TreeMap<String, String>();

		countryCapitalMap.put("India", "Delhi");
		countryCapitalMap.put("China", "Shangai");
		countryCapitalMap.put("USA",   "WDC");
		countryCapitalMap.put("UK",    "England");
		countryCapitalMap.put("Australia", "Canberra");
		countryCapitalMap.put("Japan",   "Tokyo");
		countryCapitalMap.put("Russia", "Moscov");
		countryCapitalMap.put("Canada", "Ottowa");
		countryCapitalMap.put("France", "Paris");
		countryCapitalMap.put("Italy",  "Rome");

		System.out.println("===========================Clear method====================================================");

		// countryCapitalMap.clear(); // clears all Entries.

		countryCapitalMap.forEach((a, s) -> System.out.println(a + " " + s));

		System.out.println("============================Compute method====================================================");

		countryCapitalMap.compute("Canada", (key, value) -> value.concat(" Modified")); // does modification for values
																						// if present
																						// return null if Key not
																						// present

		System.out.println("===============================Values method=====================================================");

		countryCapitalMap.values().stream().forEach(val -> System.out.println(val));

		System.out.println("================================ComputeifAbsent method====================================================");

		countryCapitalMap.computeIfAbsent("Vatican", val -> "VaticanCity"); // adds new key and val if absent.
		countryCapitalMap.computeIfAbsent("Italy", val -> "VaticanCity");

		System.out.println(countryCapitalMap);

		System.out.println("====================================ComputeifPresent method====================================================");

		countryCapitalMap.computeIfPresent("Vatican", (key, val) -> val.concat(" new")); // does modification if key is
																							// present otherwise no.
		countryCapitalMap.computeIfPresent("Zimbabwe", (key, val) -> "VaticanCity");

		System.out.println(countryCapitalMap);

		System.out.println("==========================ContainsKey method====================================================");

		System.out.println(countryCapitalMap.containsKey("India")); // return true of false for key passed

		System.out.println("==========================ContainsValue method====================================================");

		System.out.println(countryCapitalMap.containsValue("Delhi")); // return boolean for val passed

		System.out.println("===========================entry set method================================================================");

		Set<Entry<String, String>> entries = countryCapitalMap.entrySet(); // returns Set for the Map passed.

		System.out.println(entries);

		System.out.println("==================================get method=================================================================");

		System.out.println(countryCapitalMap.get("India")); // return value of key passed

		System.out.println("=====================================get or default method======================================================");

		System.out.println(countryCapitalMap.getOrDefault("Peru", "Default val")); // return val for key if present else
																					// default val passed.

		System.out.println("====================================isEmpty method=============================================================");

		System.out.println(countryCapitalMap.isEmpty());

		System.out.println("====================================keySet method==============================================================");

		Set<String> keys = countryCapitalMap.keySet();

		System.out.println(keys);

		System.out.println("=========================================merge method================================================================");

		Map<String, String> mergeMap = new TreeMap<String, String>();

		mergeMap.put("India", "New Delhi");
		mergeMap.put("Germany", "Berlin");

		countryCapitalMap.merge("India", "New Delhi", (key, value) -> key + "/" + value); // merge new value to exising
																							// key if previously null
																							// simply shows new one

		System.out.println(countryCapitalMap);

		mergeMap.forEach((key, val) -> countryCapitalMap.merge(key, val,
				(oldVal, newVal) -> oldVal.equalsIgnoreCase(newVal) ? oldVal : oldVal + ", " + newVal));

		System.out.println(countryCapitalMap); // whole map can be merged, return int

		System.out.println("=======================putAll method============================================================");

		Map<String, String> testMap = new HashMap<>();

		testMap.put("India", "30");
		testMap.put("Srilanka", "Coloumbo");

		testMap.putAll(countryCapitalMap); // adds countrymap to test, retain val of country if key is duplicate.
		countryCapitalMap.putAll(testMap); // adds test to country , retain val of test .

		System.out.println(testMap);

		System.out.println("=============================Putifpresent method============================================================");

		String previousVal = countryCapitalMap.putIfAbsent("Spain", "Madrid"); // adds new enrty is absent
		String previousVal2 = countryCapitalMap.putIfAbsent("Spain", "Madrid2"); // doesnt add if present

		System.out.println(previousVal);
		System.out.println(previousVal2);

		System.out.println("================================Remove method===============================================================");

		countryCapitalMap.remove("Spain"); // remove the key from map.

		countryCapitalMap.keySet().stream().forEach(key -> System.out.println(key));

		System.out.println("=================================Remove parameterised method===============================================================");

		countryCapitalMap.remove("UK", "Denmark"); // does not remove the key from map if val doent match

		countryCapitalMap.keySet().stream().forEach(key -> System.out.println(key));
		
		System.out.println("===================================replace method=======================================================================");
		
		String oldVal=countryCapitalMap.replace("Vatican", "New vatican");  // replaces
		boolean changed=countryCapitalMap.replace("Vatican", "New vatican", "New new vatican");
		System.out.println(oldVal);
		System.out.println(changed);
		
		System.out.println("================================replace all method====================================================================");
		
		countryCapitalMap.replaceAll((key, value)->value.toUpperCase()); // replace only all value for defined.
		
		System.out.println(countryCapitalMap);
	}

}

