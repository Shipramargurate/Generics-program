package com.bridgelabz;

public class FindMaximumMain {

	public static void main(String[] args) {
		FindMaximum<Integer> fm = new FindMaximum<Integer>(9, 99, 66);
		fm.testMaximum();
		FindMaximum<Float> fm1 = new FindMaximum<Float>(0.1f, 2.2f, 9.9f);
		fm1.testMaximum();
		FindMaximum<String> fm2 = new FindMaximum<String>("apple", "lychee", "grapes");
		fm2.testMaximum();
	}

}
