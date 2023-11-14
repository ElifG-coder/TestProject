package com.practice;

public class thisandSuperConstructor {
	
	thisandSuperConstructor(){
		System.out.println("non argumant constructor");
	}
	thisandSuperConstructor(int x){
		this();
	}

	
	public static void main(String[] args) {
		thisandSuperConstructor obj=new thisandSuperConstructor(0);
		
	}

}
