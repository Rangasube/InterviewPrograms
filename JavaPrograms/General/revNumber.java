package General;

public class revNumber {
public static int revNum(int num) {
	int reverse=0,remainder;
	while(num!=0)
	{
		remainder = num%10;
		reverse = reverse*10+remainder;
		num/=10;
	}
	return reverse;
}
public static void main(String[] args) {
	System.out.println(revNum(1234));
}
}
