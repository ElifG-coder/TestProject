package com.practice;

public class NestidIf3 {//else icinde de if conditon olabilir.

	public static void main(String[] args) {
		int age=26;
		if(age<18) {
			System.out.println("You are teenager");
		}else {
			System.out.println("you are an  adult");
		 
		if(age<64) {
			System.out.println("You are eligible to work");
		}else {
			System.out.println("enjoy your life");
		}
	}

}
}
