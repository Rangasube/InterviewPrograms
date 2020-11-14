package General;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumInterval {
	public static void primenumList(int StartNum, int EndNum) {
		
		//to store the primenumbers
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = StartNum;i<=EndNum;i++) {
			int counter = 0;
			for(int num=i;num>=1;num--) {
				if(i%num==0)
				{
					counter=counter+1;
				}
			}
			if(counter==2)
			{
				list.add(i);
			}
		}
		System.out.println("Number of PrimeNumbers Between "+StartNum+" and "+EndNum+" is: "+list.size());
		for(int k : list) {
		System.out.print(k+" ");
		}
	}
	public static void main(String[] args) {
		primenumList(1, 100);
	}
}
