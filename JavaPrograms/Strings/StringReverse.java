package Strings;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args)  
	{  
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a string: ");  
		String str= sc.nextLine();              //reads string  
		for(int i = str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));

		}
	}  
}
