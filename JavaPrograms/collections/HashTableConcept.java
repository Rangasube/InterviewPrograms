package collections;

import java.util.Hashtable;

public class HashTableConcept {
public static void main(String[] args) {
	Hashtable h = new Hashtable();
	h.put(1,100);
	h.put("A", "Mani");
	h.put(2, "Saisharan");
	System.out.println(h.size());
	System.out.println(h.get(1));
	System.out.println(h.get("A"));
	
	Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>(); 
	h1.put(3, 300);
	Hashtable<String, String> h2 = new Hashtable<String, String>();
	h2.put("B","Fury");
	System.out.println(h1.get(3));
	System.out.println(h2.get("B"));

		
}
}
