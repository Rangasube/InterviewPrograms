package Arrays;

public class NonRepeatedElements {
public static void uniqueElems(int[] a) {
	for(int i=0;i<a.length;i++)
	{
		boolean unique = true;
		for(int j=0;j<a.length;j++)
		{
			if(a[i]==a[j] && i!=j)
			{
				unique = false;
				break;
			}
		}
		if(unique)
			System.out.print(a[i]+" ");
	}
}
public static void main(String[] args) {
	int[] a = {1,2,2,4,3,4,5};
	uniqueElems(a);
}
}
