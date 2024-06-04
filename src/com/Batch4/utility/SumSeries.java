package com.Batch4.utility;

public class SumSeries {

	public static void main(String[] args) {
		int input =10;
	seriesSum(input);

	}
	public static void seriesSum(int input) {
		int sum =0;
		int swap =0;
		for(int i =1; i<=input;i+=2) {
			if(swap ==0) {
				sum = sum+i;
				swap =1;
			}
			else {
				sum=sum-i;
				swap =0;
			}
		}
		System.out.println(sum);
	}
}
