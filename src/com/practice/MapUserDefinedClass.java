package com.practice;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class Store{
	public String type;
	public String name;
	public Store(String type,String name) {
		this.type=type;
		this.name=name;
		
	}
	public abstract void  workingHours();
	public void display() {
		System.out.println("This is store "+name);

		}
}

class Costco extends Store{
	Costco(String type,String name){
		super(type,name);
		}
	@Override
	public void workingHours() {
		System.out.println(name+" works from 8 am until 8 pm");
		
	}
	
}
class Amazon extends Store{
	public Amazon(String type,String name) {
		super(type,name);
	}

	@Override
	public void workingHours() {
		System.out.println(name+" works 24/7");
		
	}
	
}
class Nike extends Store{
	Nike(String type,String name){
		super(type,name);
	}

	@Override
	public void workingHours() {
		System.out.println(name+" works from 10 am to 6 pm");
		
	}
}

public class MapUserDefinedClass {
	public static void main(String[] args) {
		//we want to store stores in form 1-->Amazon,2-->Costco,3-->Nike
		Map<Integer,Store>storeMap=new LinkedHashMap<>();
		storeMap.put(1, new Amazon("onLine","Amazon"));
		storeMap.put(2, new Costco("wholesale","Costco"));
		storeMap.put(3, new Nike("retail","Nike"));
		System.out.println(storeMap);
		
		//to get an access to all methods of our Store Objects: .values(),keySet(),entrySet()
		
		//1.way-->get all Value objects
		Collection<Store>col=storeMap.values();
		//System.out.println(col);//class isimleri verir
		System.out.println("________Using .values() method with loop");
		for(Store store:col) {
			store.workingHours();
			store.display();
		}
		System.out.println("____________Using .values() method with iterator______________");
		Iterator<Store>it=col.iterator();
		while(it.hasNext()) {
			Store st=it.next();
			st.workingHours();
			st.display();
		}
		
		//2.way-->get all entry objects using entry set-->getValue
		System.out.println("____________Using Entry Set with loop_____________");
		Set<Entry<Integer,Store>>storeSet=storeMap.entrySet();
		for(Entry<Integer,Store> entry:storeSet) {
			entry.getValue().workingHours();
			entry.getValue().display();
		}
		System.out.println("____________Using Entry Set with iterator___________");
		Iterator<Entry<Integer,Store>> entryIt=storeSet.iterator();
		while(entryIt.hasNext()) {
			Entry<Integer,Store>e=entryIt.next();
			e.getValue().workingHours();
			e.getValue().display();
		}
		
		//3.way-->get all keys-->get value of specified key
		System.out.println("_____________Using .keySet() with loop________");
		
		Set<Integer>keys=storeMap.keySet();
		for(int key:keys) {
			storeMap.get(key).workingHours();
			storeMap.get(key).display();
		}
		System.out.println("________Using .keySet() with iterator");
	Iterator<Integer>k=keys.iterator();
	while(k.hasNext()) {
		Integer  a=k.next();
		storeMap.get(a).workingHours();
		storeMap.get(a).display();
		
	}
		
		
		
		
		
	}

}
