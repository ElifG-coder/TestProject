package com.practice;

public interface Trustable {
	//by default compiler will make method to 
void trust();
}
interface Bank1 extends Trustable{
	//by default compiler will make method
	void deposit();
	void withDraw();
}

class BOA1 extends Finance implements Bank1,CreditUnion{

	@Override
	public void trust() {
		System.out.println("BOA is trustable");
		
	}

	@Override
	public void giveCredit() {
		System.out.println("BOA gives credit");
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withDraw() {
		System.out.println("You can make a deposit at BOA");
		
	}
	
}
interface CreditUnion{
	void giveCredit();
}

class Finance{
	public void financing() {
		System.out.println("Dealing with financing");
	}
}

	


