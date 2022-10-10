package com.bridgelabz;

// Refactor2 --> Refactor to create Generic Class to take in 3 variables of Generic Type

public class FindMaximum<T extends Comparable<T>> {

	T X, Y, Z;

	public FindMaximum(T X, T Y, T Z) {
		this.X = X;
		this.Y = Y;
		this.Z = Z;
	}
	public void testMaximum() {
		testMaximum(X, Y, Z);
	}
	static <T extends Comparable<T>> void testMaximum(T X, T Y, T Z) {
		if ((X.compareTo(Y)) >= 0 && (X.compareTo(Z)) >= 0)
			System.out.println(X + " is the largest");
		else if ((Y.compareTo(X)) >= 0 && (Y.compareTo(Z)) >= 0)
			System.out.println(Y + " is the largest");
		else
			System.out.println(Z + " is the largest");

	}
}
