package com.tech.cheatsheet;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("******************** ");
		
		//try catch block 
		
		try {
		    int result = 10 / 0;
		    System.exit(0);
		} catch (ArithmeticException e) {
		    System.out.println("Cannot divide by zero");
		} finally {
		    System.out.println("This block always executes");
		}


	}

}
