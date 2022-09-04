package com.set;

import java.util.HashSet;

public class Setdemo {
	
	public static void main(String[] args) {
		HashSet<String> hm=new HashSet<>();
		hm.add("abc");
		hm.add("ABC");
		System.out.println(hm);
		String v="abc";
		boolean result=hm.removeIf(va-> va.length()>2);
		System.out.println(result);
		System.out.println(hm);
		int i=10;
		
	}

}
