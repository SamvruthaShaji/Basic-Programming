package com.Batch4.utility;

public class Zpattern {

	public static void main(String[] args) {
		int input =5;
	 patternZ(input);
 
	}

	public static void patternZ(int input) {
		for(int i=1;i<=input;i++) {
			
			for(int j=input;j>0;j--) {
				if(i==1||j==i|| i==input ) {
					System.out.print("*");
					}
				else {
					System.out.print(" ");
				}
			
				
			}
			
			System.out.println();
		}
		
	}
}


