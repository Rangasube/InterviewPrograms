package Strings;

public class swapCharacter {

	public static void swapChar(String s) {
		char[] a = s.toCharArray();
		char temp;
		
		//traverse the char array
		for(int i=0;i<a.length-1;i+=2) //if input size is even then use /a.length/ if it is odd /a.length-1/->works for both even and odd
			//since i+2 it is even number so arraly length should also be even i.e; a.length-1
		{
			// swapping every second character
			temp = a[i];
			a[i] = a[i+1];
			a[i+1] = temp;
		}
		// printing a new String of swapped characters
		System.out.println(new String(a));
	}
	public static void main(String[] args) {
		swapChar("welcome");
	}
}
