package com.practice;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapBestBuyStore {

	public static void main(String[] args) {
		Map<Integer,String>bestbuy=new LinkedHashMap<>();
		bestbuy.put(7664847,"Printer");
		bestbuy.put(7879885,"Tv");
		System.out.println(bestbuy);
		
		Set<Entry<Integer,String>>entry=bestbuy.entrySet();
	for(Entry<Integer,String>ent:entry) {
		System.out.println(ent.getKey()+"="+ent.getValue());
		
		
	}
	System.out.println("________Iterator________");
	Iterator<Entry<Integer,String>>it=entry.iterator();
	while(it.hasNext()) {
		Entry<Integer,String>e=it.next();
		System.out.println(e.getKey()+"="+e.getValue());
	}
		
		
	}

}
