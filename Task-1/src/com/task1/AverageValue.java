package com.task1;

public class AverageValue {
	public static void calculate(int[]array) {
			int minimum=array[0],maximum=array[0];
			float value=0,count=0;
			for(int i=0;i<array.length;i++) {
				if(array[i]>maximum) {
					maximum=array[i];
				}
				else if(array[i]<minimum) {
					minimum=array[i];
				}
			}
			for(int i=0;i<array.length;i++) {
				if(array[i]!=minimum&&array[i]!=maximum) {
					value+=array[i];
					count++;
				}
			}
			System.out.println("Average values except largest and smallest values is "+(value/count));
		}
}
