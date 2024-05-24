package com.tech.cheatsheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) throws IOException {
		
		// Example of using Scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter string ");
		int n = scanner.nextInt();
		String s = scanner.next();
		

		// Example of using BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("text eneter ");
		String line = br.readLine();



	}

}
