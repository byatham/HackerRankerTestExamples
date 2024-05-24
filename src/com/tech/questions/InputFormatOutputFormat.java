package com.tech.questions;

import java.util.Scanner;

public class InputFormatOutputFormat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your input ");
        int intValue = scanner.nextInt();
        // Read the double
        double doubleValue = scanner.nextDouble();
        scanner.nextLine();  // Consume the newline character left by nextDouble() // if we dont write this line program will terminate
        // Read the String
        String stringValue = scanner.nextLine();
        
        scanner.close();
        
        // Print the results
        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + intValue);

	}

}
