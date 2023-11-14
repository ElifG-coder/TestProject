package com.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowersArrayListTest {

	public static void main(String[] args) {
		// store flowers into array
		Flowers[] flower= {new Rose("Rose"),new Tulip("Tulip"),new Sunflower("Sunflower")};

		//store flowers into arrays
		ArrayList<Flowers> flow=new ArrayList<>();
		flow.add(new Rose("Rose"));
		flow.add(new Tulip("Tulip"));
		flow.add(new Sunflower("Sunflower"));
		//flow.add("Rose"); cannot add String object into ArrayList of Flowers Objects
		
		Iterator<Flowers> it=flow.iterator();
		while(it.hasNext()) {
			Flowers flo=it.next();//it.next()'i variable icine store/assign etmeseydik yani "it.next().bloom();" olarak yazsaydik iterarion'i objectler ustunde yapacakti 
			                      // yani Rose classs'tan direk Tulip class'a gececekti.. class icine girmiycekti.
			flo.bloom();
			
		}
		System.out.println("_____________");
		//advanced for loop
		for(Flowers obj:flow) {
			obj.bloom();
		}
		System.out.println("______________");
		//regular for loop
		for(int i=0;i<flow.size();i++) {
			Flowers obj=flow.get(i);
			obj.bloom();
		}
		
		
	}

}
