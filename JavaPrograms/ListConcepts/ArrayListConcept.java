package ListConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
public static <E> void main(String[] args) {
	int[] a = new int[3];//static array -- size is fixed
	
	//dynamic array -- arraylist
	//1. can contain duplicate elements
	//2. maintains insertion order
	//3. Synchronized
	//4. allows random access to fetch the element because it stores the values on the basis of indices
	
	ArrayList ar = new ArrayList();
	ar.add(10);
	ar.add(20);
	ar.add(30);
	
	System.out.println(ar.size());
	
	ar.add(40);
	ar.add(50);
	ar.add(12.33);
	ar.add("Test");
	ar.add('a');
	ar.add(true);
	
	System.out.println(ar.size());
	System.out.println(ar.get(3));//to get the value from the index
	
	//To print all the values from arrayList
	//1.for loop
	//2.usint iterator
	
	for(int i = 0; i<ar.size(); i++) {
		System.out.println(ar.get(i));
	}
	
	//Non Generic Vs Generic
	
	ArrayList<Integer> ar1 = new ArrayList<Integer>();
	ar1.add(100);
	
	ArrayList<String> ar2 = new ArrayList<String>();
	ar2.add("Mani");
	
	ArrayList<E> ar3 = new ArrayList<E>(); //when data type parameter is not specified
	
	Employee e1 = new Employee("Mani",24,"QA");
	Employee e2 = new Employee("Naveen",35,"SDET");
	Employee e3 = new Employee("Rahul",25,"Dev");
	Employee e4 = new Employee("Karan",27,"Support");
	
	ArrayList<Employee> ar4 = new ArrayList<Employee>();
	ar4.add(e1);
	ar4.add(e2);
	ar4.add(e3);
	ar4.add(e4);
	
	//iterator to traverse the values
	Iterator<Employee> it = ar4.iterator();
	while(it.hasNext()) {
		Employee emp = it.next();
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dept);
		
		//************************************************
		
		//addAll()
		
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Mani");
		ar5.add("siya");
		ar5.add("ravi");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Ram");
		ar6.add("karuna");
		
		ar5.addAll(ar6);
		
		for(int i = 0; i<ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		
		//removeAll
		
		ar5.removeAll(ar6);
		for(int i=0; i<ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		
		//retainAll
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("Mani");
		ar7.add("siya");
		ar7.add("ravi");
		
		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("Mani");
		ar8.add("karuna");
		
		ar7.retainAll(ar8);
		for(int i = 0; i<ar7.size(); i++) {
			System.out.println(ar7.get(i));
		}
	}
	}
}
