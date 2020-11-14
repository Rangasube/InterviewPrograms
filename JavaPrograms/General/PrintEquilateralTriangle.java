package General;

import java.util.Scanner;

public class PrintEquilateralTriangle {

	public static void printTriangle(int rows) {
		
		 // loop to iterate for the given number of rows 
        for (int i = 1; i <= rows; i++) { 
  
            // loop to print the number of spaces before the star 
            for (int j = rows; j >= i; j--) { 
                System.out.print(" "); 
            } 
  
            // loop to print the number of stars in each row 
            for (int k = 1; k <= i; k++) { 
                System.out.print("* "); 
            } 
  
            // for new line after printing each row 
            System.out.println(); 
        } 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No.Of rows to be printed : ");
		int rows = sc.nextInt();
		printTriangle(rows);
	}
}
