package Strings;

import java.util.Arrays;

public class IsAnagram {
public static boolean isAnagram(String a,String b) {
	
	char[] ca = a.toCharArray();
	char[] cb = b.toCharArray();
	
	if(ca.length==cb.length) {
		Arrays.sort(ca);
		Arrays.sort(cb);
	}
	if(Arrays.equals(ca,cb)) {
		return true;
	}else {
		return false;
	}
	}
public static void main(String[] args) {
	System.out.println(isAnagram("sai","ias"));
}
}
