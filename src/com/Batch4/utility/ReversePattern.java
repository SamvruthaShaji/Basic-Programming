package com.Batch4.utility;

public class ReversePattern {

	public static void main(String[] args) {
		int input =5;
		revPattern(input);

	}
	  private static void revPattern(int input) {
	        int mid = (input + 1) / 2;
	 
	        for (int i = 1; i < mid; i++) {
	            for (int j = 0; j < (mid - i); j++) {
	                System.out.print("  ");
	            }
	            for (int j = i; j > 0; j--) {
	                System.out.print(j + " ");
	               
	            }
	            for (int j = 2; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        } 
	     
	        for (int i = mid; i > 0; i--) {
	            System.out.print(i + " ");
	        }
	        for (int i = 2; i <= mid; i++) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    
	        for (int i = mid - 1; i > 0; i--) {
	            for (int j = 0; j < (mid - i); j++) {
	                System.out.print("  ");
	            }
	            for (int j = i; j > 0; j--) {
	                System.out.print(j + " ");
	            }
	            for (int j = 2; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }
	    }
}
