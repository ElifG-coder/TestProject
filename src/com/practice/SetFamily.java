package com.practice;

import java.util.*;


public class SetFamily {

	public static void main(String[] args) {
		//hashset doesn't guarantee insertion order
		Set<String>veggies=new HashSet<>();
		veggies.add("carrot");
		veggies.add("potato");
		veggies.add("cucumber");
		veggies.add("eggplant");
		veggies.add("potato");
		veggies.add("cucumber");
		System.out.println(veggies);//doesn't except duplicates
		
		//LinkedHashSet guarantte insertion order
		Set<String>fruit=new LinkedHashSet<>();
		fruit.add("apple");
		fruit.add("mango");
		fruit.add("kiwi");
		fruit.add("tomato");
		fruit.add("banana");
		fruit.add("mango");
		fruit.add("tomato");
		System.out.println(fruit);
		
		//tree set stores objects in ascending order
		Set<String>food=new TreeSet<>(veggies);
		//or
		//Set<String>food=new TreeSet<>();
		//food.addAll(veggies);
		//food.addAll(fruits);
		System.out.println(food);
		

	}

}
