package com.practice;

public class ParentInheritance {
	 String studentName;
	String studentLastname;
	ParentInheritance(String name,String lastname){
		studentName=name;
		studentLastname=lastname;
	}
	public String studentEmail() {
		String  email=studentName+studentLastname+"@gmail.com";
		return email;
	}

}
