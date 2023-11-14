package com.Interview;

import java.util.Iterator;

public class Array {

	public static void main(String[] args) {
		int[] arr=new int[4];
		arr[0]=3;
		arr[1]=6;
		arr[2]=8;
System.out.println(arr.length);
//int length=arr.length;
//for(int i=0;i<length;i++) veya asagidaki gibi

for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
	
}
System.out.println();
//2.yol
for(int num:arr) {
	System.out.print(num+" ");
}
		
	
	}

}
