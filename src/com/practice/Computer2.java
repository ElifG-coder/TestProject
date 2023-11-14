package com.practice;

public class Computer2 {
	//bu ornegi constructor koyarak olmasi gerektigi gibi yaptim
	String brand;
	public Computer2(String brand) {
		this.brand=brand;
	}
	
	public void run() {
		
		System.out.println(brand+" can run the system");
	}
	public void save() {
		
		System.out.println(brand+" can save input");
	}
	public void transfer() {
		
		System.out.println(brand+" can transfer information");
		
	}public void storage() {
		
		System.out.println(brand+" can store input");
	}
}
class Apple2 extends Computer2{
	public Apple2(String brand) {
		super( brand);//constructor icinde String bir kere declaration olabilecegi icin burda tekrar String brand yazmiyoruz
	}
	public void run() {
		System.out.println(brand+" can run the system");
	}
	public void save() {
		System.out.println(brand+" can save input");
	}
	public void transfer() {
		super.transfer();
		//System.out.println(brand+" can transfer information");
		
	}public void storage() {
		System.out.println(brand+" can store input");
	}
	public void safe() {
		System.out.println(brand+"is a safer");
	}
	
}class Lenova2 extends Computer2{
	public Lenova2(String brand) {
		super(brand);
	}
	public void run() {
		super.run();
		
		//System.out.println(brand+" can run the system");
	}
	public void save() {
		System.out.println(brand+" can save input");
	}
	public void transfer() {
		System.out.println(brand+" can transfer information");
		
	}public void storage() {
		System.out.println(brand+" can store input");
	}
	
}class Hp2 extends Computer2{
	public Hp2(String brand) {
		super(brand);
	}
	/*public void run() {
		System.out.println(brand+" can run the system");
	}
	public void save() {
		System.out.println(brand+" can save input");
	}
	public void transfer() {
		System.out.println(brand+" can transfer information");
		
	}public void storage() {
		System.out.println(brand+" can store input");
	}*/
}
