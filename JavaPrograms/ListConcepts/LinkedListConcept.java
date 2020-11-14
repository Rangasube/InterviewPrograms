package ListConcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {
	public static void main(String[] args) {
		LinkedList <String> ll = new LinkedList<String>();

		ll.add("Mani");
		ll.add("Rekha");
		ll.add("Sravan");
		ll.add("kavitha");

		System.out.println(ll.size());
		System.out.println("Contents of LinkedList : "+ll);

		ll.addFirst("Roja");
		ll.addLast("Rohan");

		System.out.println("Contents of LinkedList : "+ll);
		System.out.println(ll.get(2));

		//set:
		ll.set(3, "Kunal");
		System.out.println(ll.get(3));

		//remove first and last element;
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Contents of LinkedList : "+ll);

		ll.remove(1);
		System.out.println("Contents of LinkedList : "+ll);

		//how to print all the values of linkedlist and traverse through linkedlist
		//for loop
		System.out.println("*******************using for loop");
		for(int i = 0; i<ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		//advanced for loop
		System.out.println("**********using advanced for loop");
		for(String str : ll) {
			System.out.println(str);
		}
		//iterator
		System.out.println("********* using iterator");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//while loop
		System.out.println("**********using while loop");
		int num = 0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
	}
}
