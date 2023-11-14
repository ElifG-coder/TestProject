package com.practice;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTask1 {

	public static void main(String[] args) {
		Map<Integer,String>floor=new TreeMap<>();
		floor.put(1, "Google");
		floor.put(2, "Syntax");
		floor.put(3, "Tesla");
		floor.put(3, "BOA");
		floor.put(4, "BOA");
		floor.put(5, "First American Title");
		floor.put(6, "US financial");
		int size=floor.size();
		System.out.println(size);
		System.out.println(floor);
		
		floor.replace(4, "Chase Bank");
		System.out.println(floor);
		
		floor.remove(6);
		System.out.println(floor);
		
		//how to get all keys
		Set<Integer>keys=floor.keySet();
		System.out.println(keys);
		System.out.println("__________________");
		
		//getting keys using iterator
		Iterator<Integer>keysIt=keys.iterator();
		while(keysIt.hasNext()) {
			int key=keysIt.next();
			//key is 1 and its value is Google
			System.out.println("Key is "+key+" its value is "+floor.get(key));
		}
		System.out.println("_________________");
		
		//Getting keys using for each loop
		for(Integer k:keys) {
			System.out.println("Key from floor map "+k+":"+floor.get(k));
		}
		System.out.println("_________________________");
		
		//how to get all values
		Collection<String>values=floor.values();
		     //or
		//Iterable<String>values=floor.values();
		System.out.println("*****Getting all values using for each loop");
		for(String value:values) {
			System.out.println("Value from collection "+value);
		}
		System.out.println("_____________________");
		System.out.println("***Getting all values ussing iterator");
		Iterator<String>valuesIt=values.iterator();
		while(valuesIt.hasNext()) {
			System.out.println("Map values "+valuesIt.next());
		}
		
		
		
		

	}

}
