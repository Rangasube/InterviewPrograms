package Strings;

import java.util.ArrayList;
import java.util.List;

public class AllNonRepChars {
public static void getAllNonRepChars(String s) {
	List<Character> list = new ArrayList<Character>();
	for(int i=0;i<s.length();i++)
	{
		boolean unique = true;
		for(int j=0;j<s.length();j++)
		{
			if(i!=j && s.charAt(i)==s.charAt(j))
			{
				unique=false;
				break;
			}
		}
		if(unique)
		{
			list.add(s.charAt(i));
			
		}
	}
	System.out.print("All non reptative chars are : ");
	for(char c:list)
		System.out.print(c+" ");

}
public static void main(String[] args) {
	getAllNonRepChars("gibblegabler");
}
}
