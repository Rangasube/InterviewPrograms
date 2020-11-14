package OOPsConcepts;

public class MethodOverloading {
public static void main(String[] args) {
	
}
public static void main(int a) {
	
}
public static void main(double b, double c) {
	
}

//we can overload main method also
//you cannot create a method inside a method
//duplicate methods -- i.e. same method name with a same no.of args and same data types are not allowed

//method overloading -- when the method name is same with diff args or input parameters within the same class

public void sum() {
	System.out.println("sum method -- zero param");
}
public void sum(int i) {
	System.out.println("sum method -- 1 iput param");
}
public void sum(int x, int y) {
	System.out.println("sum method --  2 input params");
}
public void sum(double d) {
	System.out.println("sum method -- 0 param but diff data type");
}
}
