package com.tech.cheatsheet;

import java.util.Arrays;
import java.util.List;

public class Loops {

	public static void main(String[] args) {
		
		//IntStream numbersList = IntStream.rangeClosed(1, 100);
		
		List<Integer> list=Arrays.asList(1,2,3,4);
		
		// For loop
		for (int i = 0; i < 10; i++) {
		    System.out.println(i);
		}
		System.out.println("******************************************");

		// While loop
		int i = 0;
		while (i < 10) {
		    System.out.println(i);
		    i++;
		}
		System.out.println("******************************************");

		// For-each loop
		for (int item :list ) {
		    System.out.println(item);
		}
		System.out.println("******************************************");

		

	}

}
