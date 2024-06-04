package com.Batch4.utility;

public class Sort {

	public static void main(String[] args) {
		int array []= {1,0,1,0,2,2,1,0};
		sorting(array);

	}
	public static void sorting(int array[]) {
		int temp =0;
		for(int i=0; i<array.length;i++) {
			for(int j=1;j<array.length;j++) {
				if(array[j-1]>array[j]) {
					temp = array[j-1];
					array[j-1]=array[j];
					array[j]= temp;
					
				}
				
			}
		}
		for( int i =0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
