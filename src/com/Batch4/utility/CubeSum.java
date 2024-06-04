package com.Batch4.utility;

public class CubeSum {

	public static void main(String[] args) {
		int input = 4;
		sumCube(input);
	}

	public static void sumCube(int input) {
		int number1 = 1;
		int number2 = 2;
		int sum = 9;
		if(input == 0) {
			System.out.println(0);
		}
		else if(input==1) {
			System.out.println(1);
		}
		else {
			
			for (int i = 3; i <= input; i++) {
				
				int fib = number1 + number2;
				if(fib%2==0) {
					sum = sum+(fib*fib);
				}
				else {
					sum = sum + (fib * fib * fib);
				}
				
				number1 = number2;
				number2 = fib;

			}
			System.out.println(sum);
		}
		
		
	}

}
