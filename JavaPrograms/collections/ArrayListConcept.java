package collections;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println(ar.size());
		
		ar.add("Ram");
		ar.add(2.01);
		ar.add('m');
		ar.remove(2);
		System.out.println(ar.size());
		
		System.out.println(ar.get(3));
		
		//to print all the values of arraylist : for loop
		for(int i = 0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		//ArrayList with generics
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("mani");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Mani");
		
	}
}
