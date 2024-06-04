package com.Batch4.utility;

public class Subarray {

	public static void main(String[] args) {
		int array[] = {1,4,5,2,6,7,2,2,5};
		int sum=9;
		arraySub(array,sum);
	}
	public static void arraySub(int array[],int sum) {
		for(int i=0;i<array.length;i++ ) {
			int count =0;
			for(int j=i;j<array.length;j++) {
				count = count+array[j];
				if(array[j]==sum) {
					break;
				}
				if(count ==sum) {
					System.out.println("Index 1:"+i +"Index last:"+j);
					break;
				}
				
			}
		}
	}

}
