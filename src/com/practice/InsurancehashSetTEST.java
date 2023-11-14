package com.practice;

import java.util.HashSet;
import java.util.Iterator;

public class InsurancehashSetTEST {

	public static void main(String[] args) {
		HashSet<InsuranceAL> hset=new HashSet<>();
		hset.add(new Car2("Geico","BMW"));
		hset.add(new Pet("Progressive","Dog"));
		hset.add(new Health("BCBS"));
		
		System.out.println(hset.size());
		
		Iterator<InsuranceAL>it=hset.iterator();
		while(it.hasNext()) {
			//System.out.println(it.next());// Bu sekil yazinca class isimlerini verir sadece
			//it.next().getQuote();//it.next()'i variable icine store etmeseydik yani "it.next().getQuete();" olarak yazsaydik iterarion'i objectler ustunde yapacakti 
                                    // yani Car2 classs'tan direk Pet yada Health class'a gececekti.. class icine girmiycekti.mesela en son pet classta burayi yapsa sonra
			                        //alttaki methodu cagirirmak istediginde iterator pet classtan sonra baska clas olmadigi icin alttaki methodu "No such element exception" verecek.
			                        //onun icin line 28de obj'ye store ettik.
			//it.next().cancelInsurance();//Ayni aciklama ustteki ile ve sonra 
			
		//InsuranceAL obj=new Car("Geico","BMW")// bak 29.ders 54:20
		//InsuranceAL obj=new Pet();
		//InsuranceAl obj=new Health();gibi dusun	
		InsuranceAL	obj=it.next();
		obj.getQuote();
		obj.cancelInsurance();
		System.out.println("_____________________");
		}

	}

}
