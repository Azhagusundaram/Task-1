package task;

public class SumOfTwoElements {
	public static void find(int[]array,int number) {
		System.out.println("Combinations are");
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]+array[j]==number) {
					System.out.println(array[i]+","+array[j]);
				}
			}
		}
	}
}
