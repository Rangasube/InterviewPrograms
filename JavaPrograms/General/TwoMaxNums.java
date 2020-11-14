package General;

public class TwoMaxNums {
public static void topTwoNums(int[] array) {
	
	int maxOne=0,maxTwo=0;
	for(int n: array) {
		if(maxOne<n)
		{
			maxTwo=maxOne;
			maxOne=n;
		}else {
			maxTwo = n;
		}
	}
	System.out.println("Fist max num : "+maxOne);
	System.out.println("Seond max num : "+maxTwo);
}
public static void main(String[] args) {
	int[] a = {1,12,20,5,42};
	topTwoNums(a);
}
}
