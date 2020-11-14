package Strings;

public class StringContainsSubstring {

	public static void isSubstring(String a, String b) {
		boolean result = a.indexOf(b) !=-1 ? true : false;
		boolean isFound  = a.contains(b);
		System.out.println(result);
		System.out.println(isFound);
	}
	public static void main(String[] args) {
		isSubstring("saisharan","sai");
	}
}
