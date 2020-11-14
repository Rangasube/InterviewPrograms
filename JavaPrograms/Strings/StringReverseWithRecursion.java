package Strings;

public class StringReverseWithRecursion {

	public static String strRev(String s) {
		if(s.isEmpty())
		{
			return s;
		}
		return strRev(s.substring(1))+s.charAt(0);
	}
	public static void main(String[] args) {
		System.out.println("The reversed string is : "+strRev("MANI1996"));
		
	}
}
