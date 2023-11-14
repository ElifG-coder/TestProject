package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayListRemoveDuplicates {

	public static void main(String[] args) {
		// How can you remove all duplicates from ArrayList?
		List<String>aList=new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		
		Set<String>list=new LinkedHashSet<>(aList);
		System.out.println(list);
		    //or
		Set<String>set=new LinkedHashSet<>();
		set.addAll(aList);
		set.add("Alijan");
		set.add("Usman");
		System.out.println(set);
		
		//how to get only 1 value from set?-->Hashset doesn't have get() method so, we convert to list
		if(set.contains("Jasmine")) {
			System.out.println("We have Jasmine");
		}
		//1-Convert to list
		List<String>alist=new ArrayList<>(set);
		String name=alist.get(3);
		System.out.println(name);
		//2-Convert to array
		Object[]array=set.toArray();
		System.out.println(array[5]);
		
		//to sort elements of any collection
		//collections is a utility class that have methods to work with collection
		Collections.sort(alist);
		System.out.println(alist);
		
		

	}

}
