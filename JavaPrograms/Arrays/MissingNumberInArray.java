package Arrays;

public class MissingNumberInArray {
	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,4,6};
		int total_num=6;
		int expected_num_sum = total_num*((total_num+1)/2);
		int num_sum=0;
		for(int i:a)
		{
			num_sum+=i;
		}
		System.out.println(expected_num_sum-num_sum);
	}

}
