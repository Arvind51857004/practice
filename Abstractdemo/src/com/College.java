package com;

public class College extends Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student student=new College();
         student.test();
	}

	@Override
	public void exam() {
		// TODO Auto-generated method stub
		
	}
	
	public void test() {
		System.out.println("college test------>");
	}

}
