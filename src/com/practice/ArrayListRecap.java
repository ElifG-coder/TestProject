package com.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRecap {
	public static void main(String[] args) {
		//generic collection
		ArrayList<Double> alist=new ArrayList<>();
		alist.add(10.99);
		alist.add(12.90);
		//alisst.add(100);//hata verir. Collectionslarda cassting yok
		System.out.println(alist);
		
		//replace element
		alist.set(1, 13.90);
		System.out.println(alist);
		
		//retrieve single element
		System.out.println(alist.get(1));
		
		//retrieve all elements from collection
		for(double a:alist) {
			System.out.println(a);
		}
		
		//2.for loop
		for(int i=0;i<alist.size();i++) {
			double d=alist.get(i);
			System.out.println(d);
		}
		
		//3.iterator
		Iterator<Double> it=alist.iterator();
		while(it.hasNext()) {
			double d=it.next();
			System.out.println(d);
		}
		
		
		System.out.println("___________Non generic collection_______");
		ArrayList obj=new ArrayList();
		obj.add("hello");
		obj.add(100);
		obj.addAll(alist);
		System.out.println(obj);
		
		//retrieve all elements from collection
		for(Object o:obj) {
			System.out.println(o);
		}
		
		
		
	}

}
