package Arrays;

import java.util.Arrays;

public class MergingTwoArrays {
public static void main(String[] args) {
	
	int[] firstArr = {1,2,3,4};
	int[] secondArr = {5,6,7,8};
	int pos = 0;
	
	int length = firstArr.length+secondArr.length;
	
	int[] mergedArr = new int[length];
	
	for(int a:firstArr)
	{
		mergedArr[pos] = a;
		pos++;
	}
	for(int b: secondArr)
	{
		mergedArr[pos] = b;
		pos++;
	}
	System.out.println(Arrays.toString(mergedArr));
}
}
