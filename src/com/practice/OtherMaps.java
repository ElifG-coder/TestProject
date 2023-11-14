package com.practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OtherMaps {

	public static void main(String[] args) {
		// store student id and corresponding name
		//LinkedHashMap-preserves the insertion order
		
		Map<Integer,String>lmap=new LinkedHashMap<>();
		lmap.put(1000, "John Smith");
		lmap.put(1001, "Jane Smith");
		lmap.put(1002, "Bulent Smith");
		lmap.put(1003, "Elif Smith");
		System.out.println(lmap);
		System.out.println("________________________");
		
		//store objects in a form of K and V and you want to sort your keys ascending order
		Map<Integer,String>tmap=new TreeMap<>();
		tmap.put(1000, "John Smith");
		tmap.put(1001, "Jane Smith");
		tmap.put(1002, "Faisal Smith");
		tmap.put(102, "Ali Tarlaci");
		System.out.println(tmap);
		System.out.println("______________________________");
		
		//create a map of country and population and sort countries in Alphabetical order
		Map<String,Integer>pop=new TreeMap<>();
		pop.put("USA", 330000000);
		pop.put("KAZAKHSTAN",160000000);
		pop.put("India", 1326000000);
		pop.put("Afghanistan", 370000000);
		
		System.out.println(pop);
		

	}

}
