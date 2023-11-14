package com.practice;

public class FindMax2 {
	public static int findmax(int[] intArr) {
		int max=intArr[0];
		for(int num:intArr) {
			if(num>max) {
				max=num;
				
			}
		}
		System.out.println(max);
	return max;
	
	}
public static void main(String[] args) {
	int[] sample= {0,-98,3,35};
	findmax(sample);
	
}
}
