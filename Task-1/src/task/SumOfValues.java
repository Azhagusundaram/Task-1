package task;

public class SumOfValues {
	public static void calculate(int[]array) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		System.out.println("Sum of values is "+sum);
	}
}
