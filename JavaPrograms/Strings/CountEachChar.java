package Strings;

import java.util.Scanner;

public class CountEachChar {
	static void getOccuranceOfChar(String inputStr) {

		//ASCII values ranges upto 256
		int[] counter = new int[256];

		//String length
		int len = inputStr.length();

		for(int i=0;i<len;i++)
			counter[inputStr.charAt(i)]++;


		//we are creating another array with same size of the inputString
		char[] array = new char[len];
		for(int i=0; i<len;i++) 
		{
			array[i] = inputStr.charAt(i);
			int flag = 0;
			for(int j=0;j<=i;j++)
			{
				if(inputStr.charAt(i)==array[j])
					flag++;
			}
			if(flag==1)
				System.out.println("Occurance of Char "+inputStr.charAt(i)+" in the String is :"+counter[inputStr.charAt(i)]);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input String: ");
		String inputStr = sc.nextLine();
		getOccuranceOfChar(inputStr);
	}
}

