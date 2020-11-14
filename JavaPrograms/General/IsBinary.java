package General;

public class IsBinary {
static boolean isBinary(int num) {
	
	if(num==0||num==1||num<0)
	{
		return false;
	}
	
	while(num!=0)
	{
		if(num%10>1)
		{
			return false;
		}
		num/=10;
	}
	return true;
}
public static void main(String[] args) {
	System.out.println(isBinary(15101));
}
}
