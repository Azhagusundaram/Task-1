package task;

public class CommonElement {
	public static void find(int []array1,int[]array2) {
		System.out.println("Common Element is:");
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				if(array1[i]==array2[j]) {
					System.out.print(array1[i]+" ");
				}
			}
		}
		System.out.println();
	}
	public static void find(String []array1,String[]array2) {
		System.out.println("Common Element is:");
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				if(array1[i].equals(array2[j])) {
					System.out.print(array1[i]+" ");
				}
			}
		}
		System.out.println();
	}
}
