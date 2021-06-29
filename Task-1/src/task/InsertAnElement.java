package task;

public class InsertAnElement {
	public static void insert(int element,int position,int[]array) {
		int[] newarray=new int[array.length+1];
		for(int i=0;i<=array.length;i++) {
			if(position>i) {
				newarray[i]=array[i];
			}
			else if(position==i) {
				newarray[i]=element;
			}
			else {
				newarray[i]=array[i-1];
			}
		}
		for(int i=0;i<newarray.length;i++) {
			System.out.print(newarray[i]+" ");
		}
		System.out.println();
	}
}
