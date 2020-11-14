package General;
import java.util.Scanner;
//upto certain number
public class FibNum {
public void fibo() {
	int t1=0,t2=1;
	Scanner ui = new Scanner(System.in);
	System.out.println("Up to : ");
	int up_to = ui.nextInt();
	
	while(t1<=up_to) {
		System.out.print(t1+", ");
		int sum = t1+t2;
		t1=t2;
		t2=sum;
	}
}
public static void main(String[] args) {
	FibNum fib = new FibNum();
	fib.fibo();
}
}
