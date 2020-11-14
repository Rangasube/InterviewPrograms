package General;

public class NestedIf {

	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		int z = 300;
		
		// print the greatest value
		
		if (x>y & x>z)
		   System.out.println("x has greatest value");
		else if(y>x & y>z)
			System.out.println("y has greatest value");
		else
			System.out.println("z has greatest value");

	}

}
