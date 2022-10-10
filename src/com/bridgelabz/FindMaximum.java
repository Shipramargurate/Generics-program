package com.bridgelabz;

public class FindMaximum {

	// UC4--> Refactor- all 3 to one generic method and find the maximum
	<T extends Comparable<T>> T maximum(T X, T Y, T Z) {

		T max = X;
		if (Y.compareTo(max) > 0) {
			max = Y;
		}
		if (Z.compareTo(max) > 0) {
			max = Z;
		}
		System.out.println("Values are : " + X +" "+ Y +" "+ Z);
		System.out.println("The Max of 3 Values : " + max);
		return max;
	}

}