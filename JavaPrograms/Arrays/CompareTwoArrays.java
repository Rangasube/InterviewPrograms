package Arrays;

import java.util.Arrays;

public class CompareTwoArrays {
static boolean compareArrays(int[] a1, int[] a2) {
	
	if(Arrays.equals(a1,a2))
	{
		return true;
	}else {
		return false;
	}
}
public static void main(String[] args) {
	int[] a1 = {1,2,3};
	int[] a2 = {1,2,3};
	System.out.println(compareArrays(a1, a2));
}
}
