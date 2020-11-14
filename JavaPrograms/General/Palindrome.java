package General;
import java.util.Scanner;

//Given number is a Palindrome or not ???
public class Palindrome {
public static void main(String[] args) {
	Scanner ui = new Scanner(System.in);
	System.out.println("Enter the number to check : ");
	int num = ui.nextInt();
	int reversedInt=0, remainder, originalInt;
	originalInt=num;
	while(num!=0) {
		remainder = num%10;
		reversedInt = reversedInt*10+remainder;
		num = num/10;
	}
	if(originalInt==reversedInt)
	System.out.println(originalInt+" is a palindrome");
	else
		System.out.println(originalInt+" is not a palindrome");
		
	}
}

