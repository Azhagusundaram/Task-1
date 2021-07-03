package task;

import java.util.Scanner;

public class Task1Runner {
	public static void main(String [] args) {
		System.out.println("1.find the index of an array element.\n2.sum values of a numeric array.\n3.remove a specific element from an array.\n4.insert an element (specific position) into an array.\n5.if an array contains a specific value.\n6.find the maximum and minimum value of a numeric array.\n71.find the common elements between two arrays in integer.\n72.find the common elements between two arrays in string.\n8.remove duplicate elements from an array.\n9.find the number of even and odd integers in a given array of integers.\n10.compute the average value of an array of integers except the largest and smallest values.\n11.find the sum of the two elements of a given array which is equal to a given integer.\n12.reverse an array of integer values.\n13.separate even and odd numbers of an array of integers. Put all even numbers first, and then odd numbers\n14.sort a numeric array\n15.print all the LEADERS in the array.\n16.Exit");
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the Your Choice:");
			int descision=scan.nextInt(),element,position;
			int[]array;
			switch(descision) {
				case 1:
					array=ArrayElements.getArrayInInteger();
					System.out.println("Enter the element");
					element=scan.nextInt();
					IndexOfAnArrayElement.find(element,array);
					break;
				case 2:
					array=ArrayElements.getArrayInInteger();
					SumOfValues.calculate(array);
					break;
				case 3:
					array=ArrayElements.getArrayInInteger();
					System.out.println("Enter the element:");
					element=scan.nextInt();
					RemoveAnElement.remove(element,array);
					break;
				case 4:
					array=ArrayElements.getArrayInInteger();
					System.out.println("Enter the element and its position with space");
					element=scan.nextInt();
					position=scan.nextInt();
					InsertAnElement.insert(element,position,array);
					break;
				case 5:
					array=ArrayElements.getArrayInInteger();
					System.out.println("Enter the element:");
					element=scan.nextInt();
					ArrayContains.itContains(element,array);
					break;
				case 6:
					array=ArrayElements.getArrayInInteger();
					MaximumAndMinimum.find(array);
					break;
				case 71:
					int[] array1=ArrayElements.getArrayInInteger();
					int[] array2=ArrayElements.getArrayInInteger();
					CommonElement.find(array1, array2);
					break;
				case 72:
					String[] array3=ArrayElements.getArrayInString();
					String[] array4=ArrayElements.getArrayInString();
					CommonElement.find(array3, array4);
					break;
				case 8:
					array=ArrayElements.getArrayInInteger();
					RemoveDuplicate.remove(array);
					break;
				case 9:
					array=ArrayElements.getArrayInInteger();
					EvenAndOdd.find(array);
					break;
				case 10:
					array=ArrayElements.getArrayInInteger();
					AverageValue.calculate(array);
					break;
				case 11:
					array=ArrayElements.getArrayInInteger();
					System.out.println("Enter the Target Value:");
					element=scan.nextInt();
					SumOfTwoElements.find(array,element);
					break;
				case 12:
					array=ArrayElements.getArrayInInteger();
					ReverseAnArray.reverse(array);
					break;
				case 13:
					array=ArrayElements.getArrayInInteger();
					SeparateEvenAndOdd.separate(array);
					break;
				case 14:
					array=ArrayElements.getArrayInInteger();
					SortAnArray.sort(array);
					break;
				case 15:
					array=ArrayElements.getArrayInInteger();
					Leaders.find(array);
					break;
			}	
			if(descision==16) {
				break;
			}
		}
	}
}
