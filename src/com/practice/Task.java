package com.practice;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task {

	public static void main(String[] args) {
		//Retrieve all countries ascending order
		Set<String>countries=new TreeSet<>();
		countries.add("Afghanistan");
		countries.add("Monaco");
		countries.add("Bahrain");
		countries.add("Chile");
		countries.add("Poland");
		for(String country:countries) {
			System.out.print(country+", ");
			
		}
		System.out.println();
		System.out.println("___________________");
		Iterator<String>it=countries.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+", ");
		}
		System.out.println();
		System.out.println("************************************");
		
		//Remove cities which start "a"
		Set<String> cities=new LinkedHashSet<>();
		cities.add("Charles  City");
		cities.add("Franklin");
		cities.add("Ashland");
		cities.add("Richmond");
		Iterator<String>city=cities.iterator();
		while(city.hasNext()) {
			if(city.next().toLowerCase().startsWith("a"))
              city.remove();
			
		}System.out.println(cities);
		
		
		
		}

}
