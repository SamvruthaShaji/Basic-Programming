package com.Batch4.utility;

public class SumArray {

	public static void main(String[] args) {
		int array[] = {1,4,6,2,6,3,3,};
		int k =6;
		arraySum(array,k);
	}
	
	public static void arraySum(int array[],int k) {
		int count =0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				
				if((array[i]+ array[j])==k) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}

