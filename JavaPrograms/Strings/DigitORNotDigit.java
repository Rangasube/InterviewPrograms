package Strings;

public class DigitORNotDigit {
	public static boolean onlyDigits(String s) {
		if(s.matches("[0-9]+"))
		{
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(onlyDigits("12g3"));
	}
}
