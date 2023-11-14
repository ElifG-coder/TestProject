package com.practice;

import java.util.ArrayList;

public class ArrayListIntro {
	public static void main(String[] args) {
		//create an arrayList to store numbers
		ArrayList<Integer>numbers=new ArrayList<>();
		numbers.add(10);//autoboxing
		numbers.add(20);
		numbers.add(20);
		numbers.add(30);
		System.out.println(numbers.get(2));
		System.out.println("_______________");
		for(int i=0;i<numbers.size();i++) {
			int num=numbers.get(i);//autounboxing(Integer'i int yaptik.yapmasakta olur)
			System.out.println(num);
		}
		System.out.println("__________");
		for(int num:numbers) {//int yerine Integer da yazabiliriz
			System.out.println(num);
		}
	}

}
