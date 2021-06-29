package task;

public class SeparateEvenAndOdd {
	public static void separate(int[]array) {
		int k=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				int temp=array[k];
				array[k++]=array[i];
				array[i]=temp;
			}
		}
		System.out.println("Final Array");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}
