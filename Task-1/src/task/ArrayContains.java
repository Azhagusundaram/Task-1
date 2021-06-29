package task;

public class ArrayContains {
	public static void itcontains(int element,int[]array) {
		int i;
		for(i=0;i<array.length;i++) {
			if(element==array[i]) {
				System.out.println(element+" is present in an array");
				break;
			}
		}
		if(i==array.length) {
			System.out.println(element+" is not present in an array");
		}
	}
}
