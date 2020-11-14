package Strings;

public class OccuranceOfParticularCharacter {

	public static int occuranceOfChar(String s, String ch) {
		
		int count = s.length()-s.replace(ch,"").length();
		return count;
	}
	public static void main(String[] args) {
		int countOfchar = occuranceOfChar("hahaha","h");
		System.out.println(countOfchar);
	}
}
