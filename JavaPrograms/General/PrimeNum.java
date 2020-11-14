package General;
import java.util.Scanner;

//Given number is a prime number or not???

public class PrimeNum {
	public static boolean isprimenumber(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2; i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isprimenumber(17));
	}
}


