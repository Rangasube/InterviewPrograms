package General;

public class BubbleSort {
void bubbleSort(int[] a) {
	int n=a.length,temp=0;
	
	for(int i=0;i<n;i++)
	{
		for(int j=1;j<(n-i);j++)
		{
			if(a[j-1]>a[j])
			{
				temp = a[j-1];
				a[j-1] = a[j];
				a[j] = temp;
			}
		}
	}
	
	//print the result
	for(int l:a)
	{
		System.out.print(l+" ");
	}
}
public static void main(String[] args) {
    int[] a = {2,5,100,55,48,63,3,4};
	new BubbleSort().bubbleSort(a);
}
}
