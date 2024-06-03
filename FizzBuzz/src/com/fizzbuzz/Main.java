package com.fizzbuzz;

public class Main {

	public static void main(String[] args) {

	}

	public static String fizzbuzz(int i) {
		
		if (i % (3 * 5) == 0) {
			return "fizzbuzz";
		}

		if (i % 3 == 0) {
			return "fizz";
		}
		if (i % 5 == 0) {
			return "buzz";
		}
	

		return Integer.toString(i);
	}

}
