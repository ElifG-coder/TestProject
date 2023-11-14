package com.practice;

public class ConstRecap {
	
	ConstRecap(){
		System.out.println("Non argumant constructor");
	}
	ConstRecap(int x){
		this();
		System.out.println("Argumant constructor");
	}
	ConstRecap(int x,String name){
		this(x);
		System.out.println("Two argumant constructor");
		
		
	}
	public static void main(String[] args) {
		ConstRecap obj=new ConstRecap(3,"Elif");
		
	}

}
