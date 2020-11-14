package General;

public class IsArmstrongNumber {
static boolean isArmstrong(int num) {
	int sum=0,a,temp=num;
	while(num>0)
	{
		a=num%10;
		num/=10;
		sum+=(a*a*a);
	}
	if(temp==sum)
	{
		return true;
	}else {
		return false;
	}
}
public static void main(String[] args) {
	System.out.println(isArmstrong(371));
}
}
