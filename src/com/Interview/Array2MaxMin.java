package com.Interview;

public class Array2MaxMin {


	public static void main(String[] args) {
		
	    int[]ar= {6,15,-9,15,0,63};
		int max=ar[0];
		int min=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];
				
			}else if(ar[i]<min) {
				min=ar[i];
			}
		}System.out.println(max);
		System.out.println(min);
		
	}

}
