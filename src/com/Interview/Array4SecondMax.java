package com.Interview;

import java.util.Arrays;

public class Array4SecondMax {

	public static void main(String[] args) {
		//find largest,second largest,minumum?
		//easiest way
		int[] num= {1,110,-1,90,16,89,74,89,25,100};
		Arrays.sort(num);
		System.out.println("Smallest "+num[0]);
		System.out.println("Biggest "+num[num.length-1]);
		System.out.println("Second largest "+num[num.length-2]);
		System.out.println("***************");
		//more efficient way
		int[] nm= {1,110,-1,90,16,89,74,89,25,100};
		int sm=nm[0];
		int lg=0;
		int lg2=0;
		for(int i=0;i<nm.length;i++) {
			int element=nm[i];
			if(element>lg) {
				lg=element;
			}else if(element>lg2&&element!=lg) {
				lg2=element;
			}
			if(element<sm) {
				sm=element;
			}
		}
		System.out.println("Smallest "+sm);
		System.out.println("Largest "+lg);
		System.out.println("Second Largest "+lg2);
		
	}

}
