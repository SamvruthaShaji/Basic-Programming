package com.Batch4.utility;

public class MissingNumber {

	public static void main(String[] args) {
		
		int missingArray[]= {1,3,4,5};
	    int input =5;
	    missing(missingArray,input);
	 
	}
	public static void missing( int array[],int input) {
		for(int i=1;i<=input;i++) {
			int temp =0;
			for(int j=0;j<array.length;j++) {
				if(i==array[j]) {
					temp=1;
				}
			}
			if(temp==0)
			{
				System.out.println(i);
			}
		}
	}

}
