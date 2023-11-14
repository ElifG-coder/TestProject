package com.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapGrocery {

	public static void main(String[] args) {
	Map<String,Integer>grocery=new HashMap<>();
	grocery.put("milk", 1);
	grocery.put("cucumber", 3);
	grocery.put("banana", 12);
	grocery.put("cheese",2);
	grocery.put("grapes", 3);
	
	//create a map of items to buy(item,quantity) in which we want save order
	Map<String,Integer>household=new LinkedHashMap<>();
	household.put("lysol", 2);
	household.put("sanitizer", 2);
	household.put("paper towel", 3);
	household.put("toilet paper",10);
	household.put("face mask", 50);
	System.out.println(household);
	
	//create a map of items to buy(item,quantity) in which we want save ascending order
	Map<String,Integer>shopping=new TreeMap<>();
	shopping.putAll(household);
	shopping.putAll(shopping);
	

	}

}
