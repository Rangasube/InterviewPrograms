package General;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

public class SortMapByValue {
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("Maths", 95 );
		hm.put("Science",94 );
		hm.put("Social", 85 );
		hm.put("English", 82 );
		hm.put("CS", 89 );
		
		Set<Entry<String,Integer>> set= hm.entrySet();
		
		List<Entry<String, Integer>> list = new ArrayList<Entry<String,Integer>>(set);
		Collections.sort(list, new Comparator<Entry<String, Integer>>()
		{
			public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2)
			{
				return (e2.getValue()).compareTo(e1.getValue());
			}	
		});
		for(Entry<String, Integer> entry:list) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
}
