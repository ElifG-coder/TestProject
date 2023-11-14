package com.Interview;
import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		Scanner scan;
		int num=1;
		int luckyNum=17;
		scan=new Scanner(System.in);
		do {
		System.out.println("Enter any number between 1 and 20");
		num=scan.nextInt();
		}
		while(num!=luckyNum) ;
			System.out.println("You got it");
		//once do blok icindeki statementi execute eder. sonra while icindeki conditiona bakar.True verdikce 15.line'i run etmeden tekrar 
			//do blok'a yukari doner. ne zamanki while icindeki condition falsa olursa altindaki kodu run eder. 
		

	}

}
