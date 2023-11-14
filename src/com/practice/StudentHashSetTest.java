package com.practice;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class StudentHashSetTest {

	public static void main(String[] args) {
		Set<StudentHashSet> students=new LinkedHashSet<>();
		students.add(new StudentHashSet("Samir",101));
		students.add(new StudentHashSet("Karim",102));
		students.add(new StudentHashSet("John",103));
		students.add(new StudentHashSet("Jane",104));
		students.add(new StudentHashSet("Tariq",105));
		
		Iterator<StudentHashSet> student=students.iterator();
		while(student.hasNext()) {
			//StudentHashSet obj=student.next();//bu sekil olmuyor
			//System.out.println(obj);
			String name=student.next().getName();
			System.out.println(name);
			int id=student.next().studentId;
			System.out.println(id);
			
		}
	}

}
