package Strings;

public class removeAllspaces {
public static void removeAllSpaces(String s) {
	String result = s.replace(" ", "");
	System.out.println(result);
}
public static void main(String[] args) {
	removeAllSpaces("   s  a              i");
}
}
