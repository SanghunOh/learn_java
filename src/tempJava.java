// package jwe_JavaBasic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class tempJava {
	static int sum(int num1, int num2) {
		if (num1 == 0)
			throw new ArithmeticException("First parameter is not valid");
		else
			System.out.println("Both parameters are correct!!");
		return num1 + num2;
	}

	public static void main(String args[]) {
		java.util.ArrayList<Object> list = new java.util.ArrayList<Object>();
		list.add("Item1");
		list.add("Item2");
		list.add("Item3");
		list.add("Item4");
		System.out.println("The arraylist contains elements: " + list);
		int pos = list.indexOf("Item2");
		System.out.println("The index of Item2 is: " + pos);
		System.out.println("Checking is empty: " + list.isEmpty());
		int size = list.size();
		System.out.println("The size of the list is: " + size);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Index: " + i + " - Item: " + list.get(i));
		}
	}
}