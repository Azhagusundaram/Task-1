package com.task1;

public class RemoveDuplicate {
	public static void remove(int[]array) {
		int[]newarray=new int[array.length];
		int k=0;
		for(int i=0;i<array.length;i++) { 
			int count=0;
			for(int l=0;l<k;l++) {
				if(array[i]!=newarray[l]) {
					count++;
				}
			}
			if(count==k) {
				newarray[k++]=array[i];
			}
		}
		for(int i=0;i<k;i++) {
			System.out.print(newarray[i]+" ");
		}
		System.out.println();
	}
}
