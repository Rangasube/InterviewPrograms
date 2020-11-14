package Strings;

public class sumofnumsinstring {
	public static void main(String[] args) {
		int sum=0;
		
		String s = "a2re45pr456#$#$80";
		
		for(String numString: s.split("[^0-9]+"))
		{
			System.out.println(numString);
			if(!numString.isEmpty())
			{
				sum=sum+Integer.parseInt(numString);
			}
		}
		
		//print the result
		System.out.println("2+45+456+80= "+sum);
}	}
