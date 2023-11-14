package com.Interview;

public class InterviewQ4 {

	public static void main(String[] args) {
		// 1-Find how many alpha characters in a string
		//2-Find how many words in a string
		String str="H123$%^^#kldm od&";
		str=str.replaceAll("[^A-Za-z]", "");
		int num=str.length();
		System.out.println("String has "+num+" alpha characters");
		
		System.out.println("_________Second Question_________");
		
		String str1="Today is Tuesday";
		String[] str2=str1.split(" ");
		int length=str2.length;
		System.out.println("Total words in a string "+str1+"="+length);

	}

}
