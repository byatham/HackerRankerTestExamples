package com.tech.cheatsheet;

import java.util.ArrayList;
import java.util.Collections;

public class ListOperations {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);            // [1, 2, 3, 4]
		list.remove(Integer.valueOf(2));  // [1, 3, 4]
		list.remove(2);         // [1, 3] (removes element at index 2)
		Collections.sort(list); // [1, 3]
		Collections.reverse(list); // [3, 1]

	}

}
