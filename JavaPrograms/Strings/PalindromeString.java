package Strings;

public class PalindromeString {
  
	public static void palindromeString(String s) {
		
		String original, reverse="";
		original=s;
		for(int i=original.length()-1;i>=0;i--)
		{
			reverse+=original.charAt(i);
		}
		if(original.equals(reverse))
		{
			System.out.println(original+" is a palindrome String");
		}else {
			System.out.println(original+" is not a palindrome String");
		}
	}
	public static void main(String[] args) {
		palindromeString("tenet");
	}
}
