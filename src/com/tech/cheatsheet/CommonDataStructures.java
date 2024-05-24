package com.tech.cheatsheet;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonDataStructures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****************** Arrays ***********************");
		int[] arr = {1, 2, 3, 4, 5};
		int n = arr.length; // Length of the array
		System.out.println("length "+n);
		
		System.out.println("****************** ArrayList ***********************");

		

		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		
		System.out.println(arrayList.get(0));  // 10
		
		System.out.println(arrayList.size());     // 1
		
		System.out.println("****************** Hashmap ***********************");

		HashMap<String, Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		System.out.println(map.get("one"));       // 1
		System.out.println(map.containsKey("two")); // true
		System.out.println(map.remove("one")); // 1
		System.out.println(map);//  {two=2}



	}

}
