package com.practice;

public class ComputerTest {
//Computer classta constructor olmadan sonuc nasil oluyor onu gormek icin test ettim
	public static void main(String[] args) {
	//Computer apple=new Apple();
	//Computer lenova=new Lenova();
	//Computer hp=new Hp();
	
	Computer[] coms= {new Apple(),new Lenova(),new Hp()};
             for(Computer com:coms)	{
            	 com.run("Apple");
            	 com.run("Lenova");
            	 com.run("Hp");
             }

	}

}
