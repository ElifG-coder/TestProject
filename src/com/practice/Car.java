package com.practice;

public class Car {
	String make;
	public Car(String make) {
		this.make=make;
	}
	public void start() {
		System.out.println(make+" starts by turning key");
	}
	public void display() {
		System.out.println("i have "+make);
	}

}
class BMW extends Car{
	public BMW(String make) {
		super(make);
	}
	public void start() {
		System.out.println(make+" starts by pushing button");
	}public void navigate() {
		System.out.println(make+" has navigation system");
	}
}
class Mercedes extends Car{
	public Mercedes(String make) {
		super(make);
		
	}
	public void start() {
		System.out.println(make+" starts remotely");
	}
	public void prettylight() {
		System.out.println(make+" has pretty interior lights");
	}
}
class Tesla extends Car{
	public Tesla(String make) {
		super(make);
		
	}
	public void start() {
		System.out.println(make+" starts by voice");
	}
}
class Honda extends Car{
	public Honda(String make) {
		super(make);
		
	}
	
	
}