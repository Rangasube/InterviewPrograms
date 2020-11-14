package General;

public class SwapingTwoInts {
	public static void IntegerSwap(int a, int b) {

		// printing values before swap
		System.out.println("Before Swap: ");
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);

		// swapping without using third variable
		a = a+b; //(a=30)

		b = a-b; //(b=30-20 == 10)

		a = a-b; //(a=30-10 == 20)

		// printing values after swap
		System.out.println();
		System.out.println("After Swap: ");
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
	}
	public static void main(String[] args) {
		IntegerSwap(100,150);
	}
}
