package Strings;

import java.util.HashMap;
import java.util.Map;

public class CountCharUsingHashMap {
public static void getOccurance(String s) {
	char[] charArray = s.toCharArray();
	HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
	
	for(char k: charArray) {
		if(hm.containsKey(k)) {
			hm.put(k, hm.get(k)+1);
		}
		else
		{
			hm.put(k,1);
		}
	}
	for(Map.Entry<Character, Integer> entry : hm.entrySet()) {
		System.out.println(entry.getKey()+" : "+entry.getValue());
	}
}
public static void main(String[] args) {
	getOccurance("saisharan");
}
}
