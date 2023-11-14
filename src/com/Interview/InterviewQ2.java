package com.Interview;

public class InterviewQ2 {

	public static void main(String[] args) {
		// number is prime or not
		//2(1,2) 3(1,2,3) 4(1,2,3,4) 5(1,2,3,4,5)
		//number must be greater than 1
		int num=8;
		boolean isPrime=true;
		if(num>1) {
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					isPrime=false;
					break;
					
				}
			}
			
		}else {
			isPrime=false;
		}
		System.out.println("Give number "+num+" is prime? "+isPrime);

	}

}
