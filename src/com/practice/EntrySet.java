package com.practice;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EntrySet {

	public static void main(String[] args) {
		Map<String,String>land=new TreeMap<>();
		land.put("Togo", "Lomo");
		land.put("Jamaica", "Kingston");
		land.put("Iran", "Tehran");
		land.put("Peru", "Lima");
		land.put("Cuba", "Havana");
		System.out.println(land);
		
		//Storing all entry objects into a set
		Set<Entry<String,String>>allEntries=land.entrySet();
		System.out.println(allEntries);
		
		//loop through all entries to get key and value
		for(Entry<String,String>entry:allEntries) {
			//System.out.println(entry);//ister boyle yaz
			System.out.println(entry.getKey());//istersen de boyle yaz
			System.out.println(entry.getValue());//
			System.out.println("______________");
			String key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+"_____"+value);
		}
		
		//iterate through all entries to get a key and value
		System.out.println("***Use iterator");
		Iterator<Entry<String,String>>entryIterator=allEntries.iterator();
		while(entryIterator.hasNext()) {
			Entry<String,String>e=entryIterator.next();
			//System.out.println(e);//ister boyle yaz
			//or
			System.out.println(e.getKey()+":"+e.getValue());
			//or
			System.out.println("________________");
			String key$value=e.getKey()+"::::"+e.getValue();
			System.out.println(key$value);
		}
		

	}

}
