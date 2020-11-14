package General;

public class RemSpecifiedElementFromArray {
	static void remElement(int[] a, int num) {
		boolean flag = true;
		int position =0, n= a.length;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				flag = true;
				position = i;
				break;
			}else {
				flag=false;
			}
		}

		if(flag == true)
		{
			for(int i=position+1;i<n;i++)
			{
				a[i-1]=a[i];
			}
			for(int i=0;i<n-2;i++)
			{
				System.out.print(a[i]+",");
			}
			System.out.println(a[n-2]);
		}else {
			System.out.println("Element not found");
		}
	}
	public static void main(String[] args) {
		int[] a = {1,2,5,6,4};
		remElement(a,1);
	}
}
