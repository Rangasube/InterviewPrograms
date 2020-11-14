package Strings;

import java.util.ArrayList;

public class Vowels {
	// returns true if x is vowel
	public static boolean isVowel(char x) {

		return ( x =='a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' );

	}

	// method to print all vowels in the String
	public static void printVowels(String s) {

		// Stroing vowels as characters in below arraylist
		ArrayList<Character> list = new ArrayList<Character>();
		//traversing through string and checking each character is vowel or not
		for(int i=0; i<s.length();i++)
		{
			//if the character in string is a vowel then add it to the arraylist
			if(isVowel(s.charAt(i))==true) {
				list.add(s.charAt(i));
			}
		}

		//count of vowels in the given string
		System.out.println(list.size());

		//traversing the list and printing vowels one by one
		for(char c : list)
		{
			System.out.print(c+" ");
		}
	}

	//driver code
	public static void main(String[] args) {
		printVowels("mani");
	}

}
