package com.practice;

public class BankTest {

	public static void main(String[] args) {
		Bank obj=new Bank(700);
		double fee=obj.chargeFee();
		System.out.println(fee);
		
		PNC obj1=new PNC(700);
		double fee1=obj1.chargeFee();
		System.out.println(fee1);

	}

}
