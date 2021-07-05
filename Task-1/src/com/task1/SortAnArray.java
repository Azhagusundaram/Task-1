package com.task1;

import java.util.Arrays;

public class SortAnArray {
	public static void sort(int[]array) {
		for(int i=0;i<array.length-1;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("Sorted Array");
		System.out.println(Arrays.toString(array));
	}
}
