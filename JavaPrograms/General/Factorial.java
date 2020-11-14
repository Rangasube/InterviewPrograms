package General;
import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner ui = new Scanner(System.in);
	System.out.println("Enter the Number :");
	int num = ui.nextInt();
	long factorial=1;
	for(int i=1;i<=num;i++) {
		factorial*=i;
	}
	System.out.printf("factorial of %d = %d", num, factorial);
}
}
