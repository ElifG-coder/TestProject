package com.practice;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;
class Person {
	private String name;
	private  String lastName;
	private String salary;
	private int age;
	 public Person(String name,String lastName,int age,String salary) {
		 this.name=name;
		 this.lastName=lastName;
		 this.age=age;
		 this.salary=salary;
		 
	 }
	
	 public void details() {
		 System.out.println("name is: "+name+" lastname is: "+lastName+" age is: "+age+" salary is: "+salary);
	 }
	

}

 
 public class TestPersonMap{
	public static void main(String[] args) {
		Map<Integer,Person>obj=new TreeMap<>();
		obj.put(1, new Person("Ayse","Bahadir",25,"$5000"));
		obj.put(2, new Person("Ahmet","Bahadir",30,"$6000"));
		
		Collection<Person>set=obj.values();
		for(Person s:set) {
			s.details();
			
		}
		
		
	}
}
