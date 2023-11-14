package com.practice;

import java.util.Scanner;

public class NestedIf2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("have a diploma?");
		
		boolean hasDiploma=scan.nextBoolean();
		double gpa=3.2;
		if (hasDiploma) {
			System.out.println("Congratulations");
			String message=(gpa>=3.5)?"Eligible":"Study harder";
			System.out.println(message);	
			}else {
				System.out.println("get a degree");
			}
		scan.close();
	}

}
