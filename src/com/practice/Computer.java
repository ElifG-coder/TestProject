package com.practice;

public class Computer {
	//bu ornekte constructor olmadan nasil oluyor onu gormek icin yaptim bu sekilde
	public void run(String brand) {
		System.out.println(brand+" can run the system");
	}
	public void save(String brand) {
		System.out.println(brand+" can save input");
	}
	public void transfer(String brand) {
		System.out.println(brand+" can transfer information");
		
	}public void storage(String brand) {
		System.out.println(brand+" can store input");
	}
}
class Apple extends Computer{
	public void run(String brand) {
		System.out.println(brand+" can run the system");
	}
	public void save(String brand) {
		System.out.println(brand+" can save input");
	}
	public void transfer(String brand) {
		System.out.println(brand+" can transfer information");
		
	}public void storage(String brand) {
		System.out.println(brand+" can store input");
	}
	
}class Lenova extends Computer{
	public void run(String brand) {
		System.out.println(brand+" can run the system");
	}
	public void save(String brand) {
		System.out.println(brand+" can save input");
	}
	public void transfer(String brand) {
		System.out.println(brand+" can transfer information");
		
	}public void storage(String brand) {
		System.out.println(brand+" can store input");
	}
	
}class Hp extends Computer{
	public void run(String brand) {
		System.out.println(brand+" can run the system");
	}
	public void save(String brand) {
		System.out.println(brand+" can save input");
	}
	public void transfer(String brand) {
		System.out.println(brand+" can transfer information");
		
	}public void storage(String brand) {
		System.out.println(brand+" can store input");
	}
	
}
