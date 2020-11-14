package General;

public class FinalizeConcept {

	public static void main(String[] args) {

		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();

		f1= null;
		f2= null;

		System.gc(); //calling garbage collector
	}

	public void finalize() { //finalize is a method, used to clean up unused or unreferred Objects in java memory
		System.out.println("finalize method");
	}

}
