package com.tech.questions;

import java.util.Scanner;

public class EachLineInput {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Print the header
	        System.out.println("================================");
	        
	        // Read input lines
	        for (int i = 0; i < 3; i++) {
	            String str = scanner.next();
	            int num = scanner.nextInt();
	            // Format and print each line
	            System.out.printf("%-10s %03d%n", str, num);
	        }
	        
	        // Print the footer
	        System.out.println("================================");
	        
	        scanner.close();
	    }
	}
