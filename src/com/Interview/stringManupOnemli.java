package com.Interview;

import java.util.Arrays;

public class stringManupOnemli {

	public static void main(String[] args) {
		String name="Today is Monday";
		String temp;
		temp=name.substring(6);
		System.out.println(temp);
		
	System.out.println();	
	
		temp=name.substring(6, 10);
		System.out.println(temp);
		
	System.out.println();	
	
		temp=name.replace('d', 'T');
		System.out.println(temp);
		
	System.out.println();	
	
		temp=name.toLowerCase().replaceAll("today", "Tomorrow");
		System.out.println(temp);
		
	System.out.println();	
		
		String name2="!@#Hel567lo! Wo#$%rld";
		temp=name2.replaceAll("[^A-Za-z ]", "");
		System.out.println(temp);
		
	System.out.println();	
		
		String name3="Java is very important programming language";
		temp=name3.replaceFirst("a", "i");
		System.out.println(temp);
		
	System.out.println();	
		
		temp=name3.replaceAll("is", "--");
		System.out.println(temp);
		//veya
		String[] strTemp;
		strTemp=name3.split("is");
		for(String s:strTemp) {
			System.out.print(s+"--");
		}
		
	System.out.println();	
		
		
		char[] charArr;
		charArr=name.toCharArray();
		for(char c:charArr) {
			System.out.print(c+"-");
			}
		
	System.out.println();	
		
		String[] str= {"Monday","Tuesday","Wednasday"};
		System.out.println(Arrays.toString(str));
		
   System.out.println(); 
   
         String rep=name3.replace(" ", "");//-->bosluklarin yerine hic bisey koyma demek
         System.out.println(rep);
         
   System.out.println();
   
          String str1="   Elif    ";
         String trim= str1.trim();//-->bastaki ve sondaki bosluklari kesiyor
         System.out.println(trim);
   
         
		
		
	}

}
