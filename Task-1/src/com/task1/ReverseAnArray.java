package com.task1;

import java.util.Arrays;

public class ReverseAnArray {
	public static void reverse(int[]array) {
		for(int i=0;i<array.length/2;i++) {
			int temp=array[i];
			array[i]=array[array.length-i-1];
			array[array.length-i-1]=temp;
		}
		System.out.println("Reverse of an array is ");
		System.out.println(Arrays.toString(array));
	}
}
