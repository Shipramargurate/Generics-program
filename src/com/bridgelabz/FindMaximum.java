package com.bridgelabz;

public class FindMaximum {

	// UC2 -->> Find maximum in given three String

	public String checkMaximum(String X, String Y, String Z) {

		String max = X;
		if (Y.compareTo(max) > 0) {
			max = Y;
		}
		if (Z.compareTo(max) > 0) {
			max = Z;
		}
		System.out.println(max);
		return max;
	}

}