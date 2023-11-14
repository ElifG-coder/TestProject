package com.Interview;

public class FizBuzz {

	public static void main(String[] args) {
		// 1 den 100 e kadar yazdir.ikiye bolunenler fizz,uce bolunenler buzz,hem iki hem uce bolunenler fizzBuzz yazdir.
		
for(int i=1;i<=100;i++) {
if(i%6==0) {
	System.out.print("fizzBuzz");
}
else if(i%2==0) {
	System.out.print("fizz");
}
else if(i%3==0) {
	System.out.print("buzz");
}
else {
System.out.print(i);
}
}
	}

}
