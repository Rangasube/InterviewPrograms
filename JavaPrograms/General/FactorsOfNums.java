package General;

public class FactorsOfNums {

	public static void factors(int num) {
		System.out.println("Factors of "+num+" are ");
		if(num>=0) {
			for(int i=1;i<=num;i++)
			{
				if(num%i == 0 )
				{
					System.out.print(i+" ");
				}
			}
		}else {
			for(int i=num;i<=Math.abs(num);i++)
			{
				if(i==0)
				{
					continue;
				}else {
					if(num%i==0)
						System.out.print(i+" ");
				}
			}
		}
	}
	public static void main(String[] args) {
		factors(-60);
	}
}
