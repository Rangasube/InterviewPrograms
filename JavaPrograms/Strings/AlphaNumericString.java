package Strings;

import java.util.Scanner;

public class AlphaNumericString {
	public static void main(String[] args) {
		int sum=0;
		//Reading input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the AlphaNumeric String: ");
		String input = sc.nextLine();
		System.out.println("Given Input: "+input);

		//check if the input is alphanumeric using Regex
		boolean flagRegex = input.matches("([A-Za-z]+[0-9]|[0-9]+[A-Za-z])[A-Za-z0-9]*");

		//if the string is alphanumeric, extract char and check if it is a digit
		if(flagRegex==true)
		{
			for(int i=0; i<input.length(); i++)
			{
				char c = input.charAt(i); //casting string to characters
				//for comparing whether the character is a number or not
				if(Character.isDigit(c)) 
				{
					System.out.print(Character.getNumericValue(c));
					sum = sum+Character.getNumericValue(c);
				}
			}
			System.out.println();
			System.out.println("Sum of the numebrs found in "+input+" :"+ sum);
		}else {
			System.out.println(input+" is not an alphanumeric");
		}
	}
}
