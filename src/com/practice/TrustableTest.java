package com.practice;

public class TrustableTest {

	public static void main(String[] args) {
		BOA1 bank=new BOA1();
		bank.trust();
		bank.deposit();
		bank.financing();
		bank.giveCredit();
		bank.withDraw();
		
		Bank1 b=new BOA1();
		b.trust();
		b.deposit();
		b.withDraw();
	}

}
