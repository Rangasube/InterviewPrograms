package Arrays;

import java.util.HashSet;

//we can remove duplicate values from both sorted and unsorted arrays by using hashset because hashset will not allow to add duplicates in it.
public class removeDupsUsingHashSet {
public static void main(String[] args) {
	int[] a = {1,2,4,5,2,3,6,8,6,7}; //unsorted array
	HashSet<Integer> hs = new HashSet<Integer>();
	for(int i=0;i<a.length;i++)
	{
		hs.add(a[i]);
	}
	
	for(int n:hs) //for each loop
	{
		System.out.print(n+" ");
	}
}
}
