package Strings;

public class AllPermutationsInString {
public static String swapString(String s, int i, int j) {
	char[] a = s.toCharArray();
	char temp;
	
	temp = a[i];
	a[i] = a[j];
	a[j] = temp;
	
	return String.valueOf(a);
	
}
public static void generatePermutations(String s, int start, int end) {
	if(start == end-1)
	{
		System.out.println(s);
	}else {
		for(int i=start;i<end;i++)
		{
			s = swapString(s, start, i);
			generatePermutations(s,start+1,end);
			s=swapString(s,start,i);
		}
	}
	
}
public static void main(String[] args) {
	String str = "abc";
	int len = str.length();
	generatePermutations(str,0,len);
}
}
