package Arrays;

import java.util.ArrayList;

public class RepeatedElements {
	static void repEle(int[] a ) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					list.add(a[i]);
				}
			}
		}
		for(int l:list)
			System.out.print(l+" ");
	}
	public static void main(String[] args) {
		int[] a = {1,2,2,4,5,4,6};
		repEle(a);
	}
}
