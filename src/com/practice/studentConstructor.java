package com.practice;

public class studentConstructor {
	String name;
	int gr1,gr2,gr3;
	
	studentConstructor(String name,int gr1,int gr2,int gr3){
		this.name=name;
		this.gr1=gr1;
		this.gr2=gr2;
		this.gr3=gr3;
	
	}
	public void Average() {
		int av=(gr1+gr2+gr3)/3;
		System.out.println("Avergae of "+name+" is "+av);
	}

}
