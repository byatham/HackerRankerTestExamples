package com.tech.cheatsheet;

public class Conditionals {

	public static void main(String[] args) {
		int dayOfWeek=2;
		int x=10;
		
		if (x > 0) {
		    System.out.println("Positive");
		} else if (x < 0) {
		    System.out.println("Negative");
		} else {
		    System.out.println("Zero");
		}

		// Switch statement
		switch (dayOfWeek) {
		    case 1:
		        System.out.println("Monday");
		        break;
		    case 2:
		        System.out.println("Tuesday");
		        break;
		    default:
		        System.out.println("Other day");
		        break;
		}

		

	}

}
