package com.practice;

public class FindMax {
	
	public  static int max(int a,int b) {
		int result;
		if(a>b) {
			result=a;
			System.out.println(result);
		}
		else {
			result=b;
			System.out.println(result);
		}
		return result;
		
	}
	public static void main(String[] args) {
		
		max(7, 8);
		
	}

}
