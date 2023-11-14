package com.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class IterartorRemoveMethodUse {

	public static void main(String[] args) {
		// Remove every word that ends with e
		ArrayList<String> greetings=new ArrayList<>();
		greetings.add("Merhaba");
		greetings.add("Hello");
		greetings.add("Hola");
		greetings.add("Zdravstvuyte");
		System.out.println(greetings);
		
		Iterator<String> gret=greetings.iterator();
		while(gret.hasNext()) {
			if(gret.next().endsWith("e")) {
				gret.remove();
				
			}
		}
		System.out.println(greetings);//burda statement while loop disine yazdik cunku istenilen conditionlari olusturduktan sonra yeni arraylist'i almamiz lazim
		

	}

}
