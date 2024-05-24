package com.tech.cheatsheet;

import java.util.ArrayList;
import java.util.Collections;

public class UsefulLibraries {

	public static void main(String[] args) {
		System.out.println("*********** Math Library: **********************");
		System.out.println(Math.max(10, 20));  // 20
		System.out.println(Math.min(10, 20));  // 10
		System.out.println(Math.sqrt(16));     // 4.0
		System.out.println(Math.pow(2, 3));    // 8.0
		
		System.out.println("*********** Collections: **********************");

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(1);
		numbers.add(2);
		Collections.sort(numbers); // [1, 2, 3]
		System.out.println("in sort() "+numbers);
		Collections.reverse(numbers); // [3, 2, 1]
		System.out.println("in reverse() "+numbers);

		
		
		

	}

}
