package Strings;

public class combinatio {
	static void demo(String s) {
    int n=s.length();
    for(int i=0;i<n/2;i++)
    {
    	System.out.println(s.substring(i,s.length()-(i+1)));
    	System.out.println(s.substring(i+1,s.length()-(i+1)));
    }
	}
	public static void main(String[] args) {
		demo("saisharan");
	}
	
	/*
	 * 	static void print(String s,int a,int b) {
		if(a==b)
		{
			return;
		}
		System.out.println(s.substring(a++,b));
		System.out.println(s.substring(a,b--));
		print(s,a,b);
	}
	public static void main(String[] args) {
		String s="combination";
		print(s,0,s.length()-1);
	}*/
}

