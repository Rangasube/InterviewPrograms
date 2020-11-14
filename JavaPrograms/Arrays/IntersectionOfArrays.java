package Arrays;

public class IntersectionOfArrays {
	static void IntersectionArrays(int[] a1, int[] a2) {
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
				{
					System.out.println(a2[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] a1= {1,2,55,4,44};
		int[] a2 = {3,5,6,55,44};
		IntersectionArrays(a1,a2);
	}
}
