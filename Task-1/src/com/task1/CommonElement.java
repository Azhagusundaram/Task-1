package com.task1;

public class CommonElement {
	public static void find(int []array1,int[]array2) {
		int newarray[]=new int[array1.length];
		int k=0;
		System.out.println("Common Element is:");
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				if(array1[i]==array2[j]) {
					newarray[k++]=array1[i];
					for(int l=0;l<k-1;l++) {
						if(newarray[l]==array1[i]) {
							k-=1;
							break;
						}
					}
				}
			}
		}
		for(int i=0;i<k;i++) {
			System.out.print(newarray[i]+" ");
		}
		System.out.println();
	}
	public static void find(String []array1,String[]array2) {
		System.out.println("Common Element is:");
		String newarray[]=new String[array1.length];
		int k=0;
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				if(array1[i].equals(array2[j])) {
					newarray[k++]=array1[i];
					for(int l=0;l<k-1;l++) {
						if(newarray[l].equals(array1[i])) {
							k-=1;
							break;
						}
					}
				}
			}
		}
		for(int i=0;i<k;i++) {
			System.out.print(newarray[i]+" ");
		}
		System.out.println();
	}
}
