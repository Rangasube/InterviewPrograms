package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class KthLargest {
static int largestNums(Integer[] a, int k) {
	
	Arrays.sort(a,Collections.reverseOrder());
	return a[k-1];
}
public static void main(String[] args) {
	Integer[] a = {1,2,5,10,412};
	System.out.println(largestNums(a,4));
}
}
