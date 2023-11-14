package com.practice;

public class childOfParent extends ParentInheritance{
	int grade1,grade2;

	childOfParent(String name, String lastname,int grade1,int grade2) {
		super(name, lastname);
		this.grade1=grade1;
		this.grade2=grade2;
		
	}
	public void Average() {
		int av=(grade1+grade2)/2;
		System.out.println("Average of "+studentName+studentLastname+" is "+av);
	}

}
