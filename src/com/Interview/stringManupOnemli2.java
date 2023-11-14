package com.Interview;

public class stringManupOnemli2 {

	public static void main(String[] args) {
		//hello-->olleh
		//how are you-->you are how
		
		String str="hello";
		char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		
	System.out.println();	
	
			String str2="How are you";
			char[] ch2=str2.toCharArray();
			for(int i=ch2.length-1;i>=0;i--) {
				System.out.print(ch2[i]);
			}
			
	System.out.println("\n************");		
			
			String[] name=str2.split(" ");
			for(int i=name.length-1;i>=0;i--){
				System.out.print(name[i]+" ");
			}
	System.out.println();		
			
					
			String ex="akslslsls fkfklfvjvblvb fdkdlfjvlvl;vb vlvl;bb';;gh'lgf b;hg;;hg;;' ;hgb;hgb';hb; ";
			System.out.println(ex.split(" ").length);//--->kac kelime oldugunu hesaplar
			
			System.out.println(ex.charAt(0));//-->index 0'daki harfi verir
			
			for(int i=str2.length()-1; i>=0;i--) {
				System.out.print(str2.charAt(i));
			}
			System.out.println(str2.length());
			
	System.out.println();		
		
		
		boolean b=str2.contains("old");
		System.out.println(b);
		
	System.out.println();
	
	     boolean a=str2.startsWith("How");
	     boolean b1=str2.startsWith("old");
	     boolean c=str2.endsWith("you");
	     System.out.println(a);
	     System.out.println(b1);
	     System.out.println(c);
	     
	 System.out.println();
	 
	      String isim="Hello";
	      boolean a2=isim.equals("Hello");
	     boolean a3=isim.equals("hello");
	      boolean a4=isim.toLowerCase().equals("hello");
	      boolean a5=isim.equalsIgnoreCase("heLLo");
	      System.out.println(a2);
	      System.out.println(a3);
	      System.out.println(a4);
	      System.out.println(a5);
	      
	      String s="How are you";
			String[] ar=s.split("");
			
			for(int i=ar.length-1;i>=0;i--) {
				System.out.print(ar[i]);
			}   
	      
	      
	      
		
			
		}

	}


