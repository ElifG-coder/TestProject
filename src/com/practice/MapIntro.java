package com.practice;

import java.util.HashMap;

public class MapIntro {

	public static void main(String[] args) {
		HashMap<String,String>hmap=new HashMap<>();
		hmap.put("Name", "John");
		hmap.put("Last Name", "Smith");
		hmap.put("Address", "123 Test");
		hmap.put("City", "Chantilly");
		
		//how to check if map has any values?
		boolean isEmp=hmap.isEmpty();
		System.out.println("Is Map empty="+isEmp);
		
		//how many elements is Map?
		int size=hmap.size();
		System.out.println(size);
		
		//can we add more values into map?
		hmap.put("Zip", "12345");
		
		//can we store duplicate keys?No,previous values will be replaced
		hmap.put("Name", "Jane");
		System.out.println(hmap);
		
		//how access the value-->use method get and specify the key
		System.out.println(hmap.get("Name"));
		
		//to remove the value
		hmap.remove("Address");
		System.out.println(hmap);
		
		//replace values in a map
		hmap.replace("Zip", "98465");
		System.out.println(hmap);
		
		
		
		
		
		
		
	}

}
