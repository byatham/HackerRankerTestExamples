package com.tech.cheatsheet;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************************************************");
		
		String s = "hello";
		System.out.println(s.toUpperCase());          // "HELLO"
		System.out.println(s.toLowerCase());          // "hello"
		System.out.println(s.startsWith("h"));        // true
		System.out.println(s.endsWith("o"));          // true
		System.out.println(s.split(" "));             // ["hello"]
		System.out.println(s.replace('h', 'j'));  // "jello"
		
		System.out.println("*************************************************");

		
	}

}
