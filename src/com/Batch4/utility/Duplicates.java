package com.Batch4.utility;

public class Duplicates {

	public static void main(String[] args) {
		int array[] = {3,4,1,5,3,4,1};
		duplicates(array);
	}
	public static void duplicates( int array[]) {
		
		for(int i=0;i<array.length;i++) {
		for(int j=0;j<array.length;j++) {
			if(array[i]==array[j] && i!=j) {
				System.out.println(array[i]);
			
			}
			
		}
		
		}
	}

}
