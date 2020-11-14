package General;
import java.util.Scanner;
//no.of terms
public class Fibonacci {
public void fibonacci() {
	int t1=0,t2=1;//,i=1;
	Scanner ui = new Scanner(System.in);//intializing Scanner class object
	System.out.println("Enter the Limit : ");
	int count = ui.nextInt();//Reads user input value
	//Using For Loop
	for(int i=1; i<=count; ++i) {
		
		System.out.print(t1+" + ");
		int sum = t1+t2;
		t1=t2;
		t2=sum;
	}
	//Using while loop
	/*while(i<=count) {
		System.out.println(t1+"+");
		int sum = t1+t2;
		t1=t2;
		t2=sum;
		i++;
	}*/
}
public static void main(String[] args) {
	Fibonacci feb = new Fibonacci();
	feb.fibonacci();
}
}
