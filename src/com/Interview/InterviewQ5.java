package com.Interview;

public class InterviewQ5 {

	public static void main(String[] args) {
		// Reverse String
		//1-Reverse character by character
		//2-Reverse word by word
		
		System.out.println("_______character by character reverse_______");
		
		String given="I love java";
		String reverse="";
		
		for(int i=given.length()-1;i>=0;i--) {
			reverse=reverse+given.charAt(i);
			//System.out.println(reverse);
			
		}System.out.println("Reversed String="+reverse);
		System.out.println("__________2.way_________");
		
		String given2="I love java";
		String reverse1="";
		String[] arr=given2.split("");
		for(int i=arr.length-1;i>=0;i--) {
			reverse1=reverse1+arr[i];
			//System.out.println(reverse1);
			
		}System.out.println(""+reverse1);
		
		System.out.println("________word by word reverse________");
		
		
		String given3="I love java";
		String[] arr1=given3.split(" ");
		//String reverse2="";
		for(int i=arr1.length-1;i>=0;i--) {
			//reverse2=reverse2+arr1[i]+"";
			//System.out.println(reverse2);
			System.out.print(arr1[i]+" ");
			
		}//System.out.println("Reversed String="+reverse2);
		System.out.println();
		
			
		}

	}


