package task;

public class Leaders {
	public static void find(int[]array) {
		for(int i=0;i<array.length;i++) {
			int count=0;
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					count++;
				}
			}
			if(count==array.length-1-i) {
				System.out.print(array[i]+" ");
			}
		}
		System.out.println();
	}
}
