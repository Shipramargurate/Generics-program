package com.bridgelabz;

public class FindMaximumMain {
	public static void main(String[] args) {
		FindMaximum maximum = new FindMaximum();
		System.out.println("Maximumn in given Integerr is :");
		maximum.maximum(99, 99999, 999);
		System.out.println();
		System.out.println("Maximumn in given floats is :");
		maximum.maximum(1.1, 2.2, 3.3);
		System.out.println();
		System.out.println("Maximumn in given Strings is :");
		maximum.maximum("Apple", "Peach", "Banana");
	}
}