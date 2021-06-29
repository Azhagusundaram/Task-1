package task;

public class RemoveAnElement {
	public static void remove(int element,int[] array) {
		int j=0;
		int[] newarray=new int[array.length];
		for(int i=0;i<array.length;i++) {
			if(array[i]==element) 
				continue;
			else
				newarray[j++]=array[i];
		}
		System.out.println("Final Array");
		for(int i=0;i<j;i++) {
			System.out.print(newarray[i]+" ");
		}
		System.out.println();
	}
}
