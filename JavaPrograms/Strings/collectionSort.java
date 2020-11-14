package Strings;

import java.util.ArrayList;
import java.util.Collections;

public class collectionSort {
public static void sorting(String s) {
	String[] a = s.split(", ");
	ArrayList<String> arr = new ArrayList<String>();
	for(int i=0; i<a.length; i++)
	{
		if(a[i].length()>7)
		{
			arr.add(a[i]);
		}
	}
	Collections.sort(arr);
	for(String l : arr)
		System.out.println(l+" ");
}
public static void main(String[] args) {
	sorting("abraham, chichore, dandarian, boolean, geeks, welcome, collection, interstellar");
}
}
