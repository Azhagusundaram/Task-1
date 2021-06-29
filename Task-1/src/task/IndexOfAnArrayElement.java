package task;

public class IndexOfAnArrayElement {
	public static void find(int element,int[]array) {
			int i;
			for(i=0;i<array.length;i++) {
				if(array[i]==element) {
					System.out.println("The index of element "+element+" is "+i);
					break;
				}
			}
			if(i==array.length) {
				System.out.println("Element"+element+" is not in an array");
			}
	}
}
