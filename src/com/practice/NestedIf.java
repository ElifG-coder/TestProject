package com.practice;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("have a diploma?");
		
		boolean hasDiploma=scan.nextBoolean();
		double gpa;
		if (hasDiploma) {
			System.out.println("Congratulations");
			System.out.println("Enter gpa");
			gpa=scan.nextDouble();
			
			if(gpa>=3.5) {
			System.out.println("eligible for scholarship");
			}else{
				System.out.println("study harder");
				
			}
				
			}else {
				System.out.println("get a degree");
			}
		scan.close();
			}
			
	}

	


