package com.practice;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntry {

	public static void main(String[] args) {
		//Create a map that will store month and days in a month
		Map<String,Integer>month=new LinkedHashMap<>();
		month.put("January",31);
		month.put("February",28);
		month.put("March",31);
		month.put("April",30);
		System.out.println(month.size());//gives number of entries
		
		//get all entries from map
		Set<Entry<String,Integer>>entries=month.entrySet();
		System.out.println(entries);
		
		//loop through all entry objects
		System.out.println("***Using for loop");
		for(Entry e:entries) {//1.Entry e--->sadece getKey(); ve getValue(); cagirabiliriz.
			                  //2.Entry<String,Integer> e--->isterssek String manupilation yapabiliriz. Bu sekilde yazmak daha dogru
			System.out.println(e.getKey()+":"+e.getValue());
			
		}System.out.println("_________________");
		
		//Using iterator to go over all entry objects
		System.out.println("****Using iterator");
		Iterator<Entry<String,Integer>>it=entries.iterator();
		while(it.hasNext()) {
			//System.out.println(it.next().getKey()+":"+it.next().getValue());//boyle olmaz iterator ilk keyden sonra ikinci value degere geciyor
			Entry<String,Integer>entry=it.next();
			System.out.println(entry);
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		

	}

}
