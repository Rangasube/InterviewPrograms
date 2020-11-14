package Arrays;

import java.util.Arrays;

public class KthSmallestNum {
	static int smallestNum(int[] a, int k) {

		Arrays.sort(a);
		return a[k-1];
	}
	public static void main(String[] args) {
		int[] a = {1,5,6,-5,4};
		int k=2;
		System.out.println(smallestNum(a,k));
	}
}
