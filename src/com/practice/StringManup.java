package com.practice;

public class StringManup {

	public static void main(String[] args) {
		String ex="Esmcmv dlflfjkwe eeeelll";
		String[] ar=ex.split("");
		int count=0;
		for(String s:ar) {
			if(s.toLowerCase().contains("e")) {//.equals("e") de olabilir
				count++;
				
			}
			
		}
System.out.println("E is repeated "+count+" times");
	}

}
