package General;

public class IsPerfectNumber {
	static boolean isPerfect(long num) {

		long sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		System.out.println(isPerfect(24));
	}
}
