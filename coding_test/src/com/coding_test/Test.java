package com.coding_test;

public class Test {
	
	public static void main(String[] args) {
		
		int testInt = 10;
		String testString = "20";
		double testDouble = 30;
		
		
		System.out.println(String.valueOf(testInt) + " 타입 : " + (((Object)String.valueOf(testInt)).getClass().getName()));
		System.out.println(Integer.parseInt(testString) + " 타입 : " + ((Object)Integer.parseInt(testString)).getClass().getName());
		System.out.println(testDouble);
		
	
	
		
		
		
	}
	
	
}
