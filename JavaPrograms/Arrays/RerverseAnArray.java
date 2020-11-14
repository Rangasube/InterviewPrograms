package Arrays;

public class RerverseAnArray {
	public static void main(String[] args) {
		String[] a = {"Hi","Hello","Bye","GoodBye"};
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
}
