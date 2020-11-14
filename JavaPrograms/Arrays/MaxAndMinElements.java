package Arrays;

import java.util.Arrays;

public class MaxAndMinElements {
	public static void maxNminNums(int[] a) {
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for(int n:a)
		{
			if(n>largest)
			{
				largest = n;
			}else if(n<smallest) {
				smallest = n;
			}
		}
		System.out.println("Given Int Array : "+Arrays.toString(a));
		System.out.println("Largest Number : "+largest);
		System.out.println("Smallest Number : "+smallest);

	}
	public static void main(String[] args) {
		int[] a = {1,0,-2,5564892,4};
		maxNminNums(a);
	}
}
