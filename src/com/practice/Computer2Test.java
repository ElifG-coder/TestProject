package com.practice;

public class Computer2Test {

	public static void main(String[] args) {
		//Computer ornegi olmasi gerektigi gibi test edildi
		
		//Computer2 apple=new Apple2("Apple");
	//	Computer2 lenova=new Lenova2("Lenova");
		//Computer2 hp=new Hp2("Hp");
		
		Computer2[] coms= {new Apple2("Apple"),new Lenova2("Lenova"),new Hp2("Hp")};
	             for(Computer2 com:coms)	{
	            	 com.run();
	            	com.transfer();
	            	com.save();
	            	com.storage();
	            
	             }
	             //ikinci for loop-regular for loop
	           for (int i = 0; i < coms.length; i++) {
	        	   coms[i].run();
	        	   coms[i].transfer();
				coms[i].save();
				coms[i].storage();
			}

		}

	}


