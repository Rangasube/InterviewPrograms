package OOPsConcepts;

public class FunctionsInJava {
public static void main(String[] args) {
	FunctionsInJava ob1 = new FunctionsInJava();
	//one object will be created, ob1 is a ref variable, referring to this object
	//after creating the object, the copy of all non static methods will be given to this object

	ob1.test();
	
	int l = ob1.addition();
	System.out.println(l);
	
    String str = ob1.hehe();
    System.out.println(str);
    
    int d = ob1.div(12, 2);
    System.out.println(d);
}
//non static methods

//void -- does not return any value
//return type - void
public void test() { //no input, no output
	System.out.println("Test Method");
}

public int addition() { //no input, some output
	int a = 10;
	int b = 100;
	int c = a+b;
	return c;
}

public String hehe() {//no input, some output
	String s = "Hehe";
	return s;
}

//int x, y -- input parameters/arguements
public int div(int x, int y) {
	int z = x/y;
	return z;
	
}
}
