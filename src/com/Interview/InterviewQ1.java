package com.Interview;

public class InterviewQ1 {

	public static void main(String[] args) {
		// swap the 2 integers and two strings
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a is "+a);
		System.out.println("b is "+b);
System.out.println("-----second question with hard coding-------");
		String name="Elif";
		String name1="Gokrem";
		name=name.concat(name1);//ElifGokrem
		name1=name.substring(0, 4);//elif
		name=name.substring(4);//gokrem
		System.out.println("name is:"+name);
		System.out.println("name1 is:"+name1);
System.out.println("------second question without hard coding--------");
         String str1="Bulent1";
         String str2="Gokrem";
         str1=str1.concat(str2);//Bulent1Gokrem
         str2=str1.substring(0,str1.length()-str2.length() );//Bulent1
         str1=str1.substring(str2.length());//Gokrem
         System.out.println("str1 is:"+str1);
         System.out.println("str2 is:"+str2);
         System.out.println("---------second way string swap_____");
			String s1="Nergis";
			String s2="Ercument";
			s1=s1.concat(s2);
			s2=s1.replace(s2, "");
			s1=s1.replace(s2, "");
			System.out.println(s1);
			System.out.println(s2);
		}
	}


