package Arrays;

public class SecondLargestElement {
	public static void secondLargestFromArray(int[] a)
	{
		int n = a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(a[n-2]);
	}
public static void main(String[] args) {
	int[] a = {1,52,46,96};
	secondLargestFromArray(a);
}
}
