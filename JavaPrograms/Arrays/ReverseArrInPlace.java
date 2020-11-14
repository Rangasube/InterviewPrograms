package Arrays;

import java.util.Arrays;

public class ReverseArrInPlace {
static void revArr(int[] ip) {
	
	if(ip==null||ip.length<=1)
	{
		return;
	}
	
	for(int i=0;i<ip.length/2;i++)
	{
	int temp = ip[i];
	ip[i] = ip[ip.length-1-i];
	ip[ip.length-1-i] = temp;
	}
	System.out.println("Reversed Array : "+Arrays.toString(ip));
}
public static void main(String[] args) {
	int[] ip = {1,2,3,4,5,6};
	revArr(ip);
}
}
