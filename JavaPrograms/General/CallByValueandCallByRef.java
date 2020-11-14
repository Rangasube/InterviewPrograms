package General;

public class CallByValueandCallByRef {
	int p;
	int q;
	
	public static void main(String[] args) {
	CallByValueandCallByRef obj = new CallByValueandCallByRef();
	int x = 10;
	int y = 20;
	
	obj.testSum(x, y); //call by value or pass by value
	
	obj.p = 50;
	obj.q = 60;
	
	obj.swap(obj);
	//after swap
	System.out.println(obj.p);
	System.out.println(obj.q);
	}
	public int testSum(int a, int b) {
		a=40;
		b=50;
		int c=a+b;
		System.out.println(c);
		return c;
	}
	
	//call by reference
	public void swap(CallByValueandCallByRef t) {
		int temp;
		temp = t.p; //temp = 50
		t.p = t.q; //t.p = 60
		t.q = temp; //t.q = 50
	}

}
