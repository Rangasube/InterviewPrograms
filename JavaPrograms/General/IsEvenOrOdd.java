package General;

public class IsEvenOrOdd {
static void isEvenOrOdd(int num) {
	while(num!=0) {
	if(num%2==0)
		System.out.println("Number is Even");
	else
		System.out.println("Number is Odd");
	break;
	}
}
public static void main(String[] args) {
	isEvenOrOdd(126);
}
}
