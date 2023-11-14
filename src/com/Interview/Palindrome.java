package com.Interview;

public class Palindrome {
	/*create a method that will take a string and 
	 * return whether string is palindrom or not.method 
	 * should be reachable all classes within in your project
	 */
	public static boolean isPalindrom(String name) {
		String letter="";
		boolean isPalindrom=false;
		for(int i=name.length()-1;i>=0;i--) {
			 letter+=name.toLowerCase().charAt(i);
			
		}	
		
		if(name.toLowerCase().equals(letter)) {
			isPalindrom=true;
			
	 
		}
		 
		
		return isPalindrom;
	}
	
 public static void main(String[] args) {
	String name="Alla";
	boolean A=isPalindrom(name);
	System.out.println(A);
	
}
}
