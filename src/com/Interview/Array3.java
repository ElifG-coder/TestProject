package com.Interview;

public class Array3 {

	public static void main(String[] args) {
		int[] arr= {6,4,9,3,1};
		int biggest=arr[1];
		int smallest=arr[1];
		int secondbiggest=arr[1];
		
		 for(int i=0;i<arr.length;i++) {
			if(biggest<arr[i]) {
				secondbiggest=biggest;
				biggest=arr[i];
			}
				else if(smallest>arr[i]){
					
					smallest=arr[i];
					
				}
			
				
				
			}
	
		 
		
System.out.println(biggest);
System.out.println(secondbiggest);
System.out.println(smallest);
System.out.println("***************");
//2.yol
for(int i:arr) {
	if(biggest<i) {
		biggest=i;
		
	}
}
System.out.println(biggest);
	}

}
