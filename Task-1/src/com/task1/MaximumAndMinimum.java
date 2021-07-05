package com.task1;

public class MaximumAndMinimum {
	public static void find(int[]array) {
		int minimum=array[0],maximum=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]>maximum) {
				maximum=array[i];
			}
			else if(array[i]<minimum) {
				minimum=array[i];
			}
		}
		System.out.println("Minimum value is "+minimum);
		System.out.println("Maximum value is "+maximum);
	}
}
