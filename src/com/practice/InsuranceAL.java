package com.practice;
abstract class Coverage{
	public void method() {
		System.out.println("Method of covarage class");
	}
}

public abstract class  InsuranceAL extends Coverage {
	
	public String insuranceName;
	public InsuranceAL(String insuranceName) {
		this.insuranceName=insuranceName;
		
	}
	public abstract void getQuote();
	public abstract void cancelInsurance();
}
class Car2 extends InsuranceAL{
	
String carModel;
	public Car2(String insuranceName,String carModel) {
		super(insuranceName);
		this.carModel=carModel;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getQuote() {
		System.out.println("$1600 offered for 6 months insurance from "+insuranceName+" for "+carModel);
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Due to other offers, "+insuranceName+" s offer for "+carModel+" is");
		
	}
	
}
class Pet extends InsuranceAL{
	 String petType;

	Pet(String insuranceName,String petType){
		super(insuranceName);
		this.petType=petType;
		
	}

	@Override
	public void getQuote() {
		System.out.println("Offers are to high for "+petType+" from "+insuranceName+" insurance");
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Canceled due to high prices");
		
	}
}
class Health extends InsuranceAL{
	Health(String insuranceName){
		super(insuranceName);
		
	}

	@Override
	public void getQuote() {
		System.out.println("Brown family got $1500 offer from "+insuranceName+" insurance company from family health");
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Please contact customer service");
		
	}
}