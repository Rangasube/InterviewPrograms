package General;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String args[])
	{

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows of floyd's triangle you want");
		int n = in.nextInt();
		System.out.println("Floyd's triangle :-");
		int num = 1;
		for (int c = 1 ; c <= n ; c++ )
		{
			for (int d = 1 ; d <= c ; d++ )
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
