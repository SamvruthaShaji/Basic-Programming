package com.Batch4.utility;

public class NewPattern {

	public static void main(String[] args) {
          int input=10;
          newpattern(input);

	}

	private static void newpattern(int input) {
	  for(int i=0;i<input;i++) {
		  for(int j=0;j<=i;j++) {
			  System.out.print("*");
		  }
		 System.out.println();
	  }
		
	}

}
