package com.Interview;

public class InterviewQ3 {

	public static void main(String[] args) {
		// Fibonacci numbers
		//1,1,2,3,5,8,13...
		//find first 10 fibonacci numbers
		int a,b,c;
		a=0;
		b=1;
	for(int i=1;i<=10;i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}

	}

}
