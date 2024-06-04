package com.Batch4.utility;

public class FactorialSum {

	public static void main(String[] args) {
		int input = 3;
		// factorialOfNumber(input);
		inverseFactorial(input);

	}
	public static void inverseFactorial(int input) {
		float sum = 0;
		for (int i = 1; i <= input; i++) {
			sum = sum + (i / factorial(i));
		}
		System.out.println(sum);
	}

	public static float factorial(int input) {
		float factorial = 1;
		for (int i = 1; i <= input; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
}
