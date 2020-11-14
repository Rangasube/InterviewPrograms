package Strings;

public class StrReversUsingCharArray {
	public static void main(String[] args) {
		String s = "Mani";
		char[] array = s.toCharArray();
		for(int i = array.length-1; i >=0;i--) {
			System.out.print(array[i]);
		}
	}
}
