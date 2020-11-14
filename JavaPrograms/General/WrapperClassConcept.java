package General;

public class WrapperClassConcept {
public static void main(String[] args) {
	
	//Data conversion: String to int
	String x  = "333";
	System.out.println(x+25);
	
	int i = Integer.parseInt(x);
	System.out.println(i+25);
	
	//Integer,Double,Character,Boolean
	
	//String to Double conversion
	String y = "33.33";
	System.out.println(y+3.33);
	double d = Double.parseDouble(y);
	System.out.println(d+3.33);
	
	//String to Boolean
	String z = "true";
	boolean b = Boolean.parseBoolean(z);
	System.out.println(b);
	
	//int to string conversion
	int a = 222;
	System.out.println(a+22);
	String t = String.valueOf(a);
	System.out.println(t+22);
	
	String u = "100A"; //Number format exception
	int o = Integer.parseInt(u);
	System.out.println(o);
}
}
