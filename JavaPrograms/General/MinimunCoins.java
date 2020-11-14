package General;

import java.util.Scanner;
import java.util.Vector;

public class MinimunCoins {

	public static int coins[] = {2, 5, 10}; 
	public static int numOfCoins = coins.length; 

	public static void minCoins(int inputAmount) 
	{ 
		if(inputAmount < 2) {
			System.out.println("Input Amount should be 'GREATER THAN OR EQUALS TO ₹ 2' ");
		}else {
			// intializing empty result vector  
			Vector<Integer> result = new Vector<Integer>();

			// traversing through all coins from higer value to lower value  
			for (int i = numOfCoins - 1; i >= 0; i--) 
			{ 
				// finding coins which are smaller in value than entered input Amount and if they satisy the condition add them to result
				while (coins[i] <= inputAmount)  
				{
					inputAmount -= coins[i]; 
					result.add(coins[i]); 
				} 
			} 

			// printing end result  
			System.out.println("Minimum no.Of coins required : "+result.size()); //prints no.Of coins
			for (int i = 0; i < result.size(); i++) 
			{ 
				System.out.print(" " + result.elementAt(i)); 
			}
		} 
	}

	// driver code
	public static void main(String[] args)  
	{ 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Amount Here -> ");
		int n = scan.nextInt();
		System.out.println("Entered Amount is -> ₹ "+n);
		 
		minCoins(n); 
	}

}
