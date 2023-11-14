package com.practice;

public class CarTest {
	
public static void main(String[] args) {
	
	Car bmw=new BMW("BMW");
	Car mercedes = new Mercedes("Mercedes");
	Car tesla=new Tesla("Tesla");
	Car honda=new Honda("Honda");
	
	Car[] cars= {bmw,mercedes,tesla,honda};
	for(Car car:cars) {
		car.start();
		car.display();
	}
	System.out.println("__________");
	for(int i=0;i<cars.length;i++) {
		cars[i].start();
		cars[i].display();
	}
	
}
}
