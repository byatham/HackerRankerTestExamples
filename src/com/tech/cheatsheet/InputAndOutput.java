package com.tech.cheatsheet;

import java.util.Scanner;

public class InputAndOutput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your input ");
		String inputString = scanner.nextLine();  // Reading input
		System.out.println(inputString);         // Printing output

	}

}
