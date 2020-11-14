package OOPsConcepts;

public class TestBank {
public static void main(String[] args) {
	
	HSBCBank hs = new HSBCBank();
	
	System.out.println(USBank.min_bal);;
	hs.credit();
	hs.debit();
	hs.transferMoney();
	hs.educationLoan();
	hs.carLoan();
	
	//dynamic polymorphism
	//child object can be referred by the parent interface ref variable
	USBank usb = new HSBCBank();
	
	usb.credit();
	usb.debit();
	usb.transferMoney();
}
}
