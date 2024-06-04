package com.Batch4.utility;

public class AlphabetPattern {

	public static void main(String[] args) {
		int input=4;
		alphaPattern(input);
	}
	  private static void alphaPattern(int input) {
	        for(int i=1; i<=input; i++)
	        {
	            int alpha = 65;
	            int space = (input - i)+1;
	            for(int j=1; j<space; j++) {
	                System.out.print(" ");
	            }
	            for(int j=1; j<=i; j++) {
	                System.out.print(Character.toString((char)alpha));
	                alpha++;
	            }
	            for(int j=1; j<=i; j++) {
	                System.out.print(j);
	            }
	            
	            System.out.println();
	        }
	        
	    }
}
