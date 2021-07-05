package com.task1;

public class EvenAndOdd {
	public static void find(int[]array) {
		int odd=0,even=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0)
				even+=1;
			else
				odd+=1;
		}
		System.out.println("Number of odd integers : "+odd+"\nNumber of even integers : "+even);
	}
}
