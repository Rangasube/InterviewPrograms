package Strings;

import java.util.HashSet;

public class FirstRepFirstNonRep {
	public static char firstRepeated(String s) {
		char[] a = s.toCharArray();
		HashSet<Character> hs = new HashSet<Character>();
		for(int i=0;i<a.length;i++)
		{
			char c = a[i];
			if(hs.contains(c))
			{
				return c;
			}else {
				hs.add(c);
			}
		}
		return '\0';
	}
	public static void firstNonRepeated(String s) {

		for(int i=0;i<s.length();i++)
		{
			boolean unique = true;
			for(int j=0;j<s.length();j++)
			{
				if(i!=j && s.charAt(i)==s.charAt(j))
				{
					unique = false;
					break;
				}
			}
			if(unique)
			{
				System.out.println("First Non Repeated Character : "+s.charAt(i));
				break;
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("First Repated Character : "+firstRepeated("gibblegabler"));
		firstNonRepeated("gibblegabler");
	}
}
