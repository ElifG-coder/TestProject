package com.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAndIterator {

	public static void main(String[] args) {
	//create arraylist of chocolate	
		ArrayList<String> choco=new ArrayList<>();
		choco.add("kinder");
		choco.add("godiva");
		choco.add("lindth");
		choco.add("kit kat");
		choco.add("snikers");
		
	//create arraylist of sweets
		ArrayList<String> sweet=new ArrayList<>();
		sweet.add("ice cream");
		sweet.add("cheese cake");
		sweet.addAll(choco);
		
		System.out.println(sweet.size());
		System.out.println(sweet);
		
	//we want to iterate through the collection
		Iterator<String> it=sweet.iterator();
		while(it.hasNext()) {
			String element=it.next();
			if(element.equals("ice cream")) {
				it.remove();
			}
		}
		System.out.println("ArrayList after removing element");
		System.out.println(sweet);//burda statement while loop disine yazdik cunku istenilen conditionlari olusturduktan sonra yeni arraylist'i almamiz lazim
		
	//I want to get elements backwards
		for (int i=sweet.size()-1;i>=0;i--) {
			System.out.println(sweet.get(i)+";");
			
		}
	//advanced for loop
		//iterates/loops in 1 direction
		for(String str:sweet) {
			System.out.println(str);
		}

	}

}
