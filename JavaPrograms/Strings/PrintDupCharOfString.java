package Strings;

import java.util.ArrayList;
import java.util.List;

public class PrintDupCharOfString {

	public static void printrepChars(String s) {

		List<Character> list = new ArrayList<Character>();
		char[] a = s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					list.add(a[j]);
					break;
				}
			}
		}
		System.out.println(list.size());
		for(char c:list)
			System.out.print(c+" ");
	}
	public static void main(String[] args) {
		printrepChars("tiptop");
	}
}

