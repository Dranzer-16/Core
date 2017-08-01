package com.set.programs;

import java.util.HashSet;

public class HashClassProgramms {
	
	public static void main(String[] args) {
		HashSet<String> places= new HashSet<String>();
		places.add("Tamil nadu");
		places.add("Kerala");
		places.add("Andhara");
		places.add("Andhara");
		places.add("Mumbai");
		places.add("Rajhasthan");
		places.add("Mumbai");
		places.add("Delhi");
		
		places.forEach(System.out::println);
		
//		Iterator<String> iterator=places.iterator();
//		
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//			
//		}
	}

}
