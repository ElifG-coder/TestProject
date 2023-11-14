package com.practice;

import java.util.HashSet;
import java.util.Iterator;

public class HahSetDemo {

	public static void main(String[] args) {
		HashSet<String> breakfast=new HashSet<>();
		breakfast.add("eggs");
		breakfast.add("tea");
		breakfast.add("bread");
		breakfast.add("cream cheese");
		breakfast.add("coffe");
		
		//we can retrieve all elements
		Iterator<String> myIterator=breakfast.iterator();
		while(myIterator.hasNext()) {
			System.out.println(myIterator.next());
		}
		//we can't use regular for loop because it doesn't guarantee insertion order
		System.out.println("__________");
		//advanced for loop
		for(String item:breakfast) {
			System.out.println(item);
		}
	}

}
