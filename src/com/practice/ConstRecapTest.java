package com.practice;

public class ConstRecapTest extends ConstRecap{
	
	ConstRecapTest(int num,String lastName){
		super(num);//-->BURAYA super(6,"Nuri") olarak bir degerde verebiliriz ama sadece parametre gireceksek 
		           //   mutlaka constructor icindeki parametre ismi ile ayni olmali.
		            //    Constructor icinde parametre yoksa super() icine sadece deger girebiliriz.
	
		System.out.println("Test Constructor");
	}
	
	public static void main(String[] args) {
		//ConstRecapTest obj=new ConstRecapTest(5,"AYSE");
		
	}

}
