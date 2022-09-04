package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import javax.xml.transform.Templates;

public class ArrayListDemo {
	
	public static void main(String[] a) {
		ArrayListDemo ad=new ArrayListDemo();
		ad.listofstrings();
		ad.listofstudents();
	}

	public void listofstudents() {
		Student s1=new Student();
		s1.name="Arvind";
		Student s2=new Student();
		s2.name="san";
		Student s3=new Student();
		s3.name="kali";
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		
		ListIterator<Student> itr= list.listIterator();
		
		while(itr.hasNext()) {
			Student stud=itr.next();
			if(stud.name.equals("san")) {
				itr.remove();
				itr.add(s3);
			}
			
		}
		
		System.out.println(list);
		
		
		//System.out.println(list);
	}

	public void listofstrings() {
		ArrayList<String> list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		
		
		list.replaceAll(String::toUpperCase);
		
		
        ListIterator<String> itr= list.listIterator();
		
		while(itr.hasNext()) {
			String stud=itr.next();
			stud.toUpperCase();
			
		}
		
		System.out.println(list);
		
		//list.stream().forEach(temp-> System.out.println(temp.toUpperCase()));
		
		
	}
	
	
	

}
