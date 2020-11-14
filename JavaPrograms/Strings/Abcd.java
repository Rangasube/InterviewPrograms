package Strings;

public class Abcd {
	public static void abcd(String s) {
		char a = s.charAt(s.length()-1);
		String b ="";
		for(int i=0;i<s.length()-1;i++)
		{
			//System.out.print(s.charAt(i));
			b=b+s.charAt(i);
		}
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		abcd("cat");	
	}
}
