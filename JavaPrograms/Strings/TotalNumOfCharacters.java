package Strings;

import java.util.HashSet;

public class TotalNumOfCharacters {
public static void totalChars(String s) {
	char[] a = s.toCharArray();
	
	int count = 0;
	for(int i=0;i<s.length();i++)
	{
		char c = s.charAt(i);
		if(c!=' ')
		{
			count++;
		}
	}
	System.out.println(count);
}
public static void main(String[] args) {
	totalChars("the best of both worlds");
}
}
