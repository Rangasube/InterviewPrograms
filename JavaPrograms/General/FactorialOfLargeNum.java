package General;

import java.math.BigInteger;

public class FactorialOfLargeNum {
	public static void main(String[] args) {
		BigInteger fact = BigInteger.ONE;
		int n=500;
		for(int i=2;i<=n;i++)
		{
			fact=fact.multiply(new BigInteger(String.valueOf(i)));
		}
		System.out.println("Factorial of "+n+" is : "+fact+" ");
	}
}
