package OOPsConcepts;

public class HSBCBank implements USBank, BrazilBank{ //here we are achieving multiple inheritance
	//Is-a relationship
	
    //if a class is implementing any interface, then it is mandatory to define/override all the methods of interface
	
	//Overriding from USBank
	public void credit() {
		System.out.println("credit method");
	}

	public void debit() {
		System.out.println("debit method");
	}

	public void transferMoney() {
		System.out.println("transferMoney method");
	}
	
	//seperate methods of HSBCBank
	public void educationLoan() {
		System.out.println("educationLoan method");
	}
	public void carLoan() {
		System.out.println("carLoan method");
	}
	
	//OVerriding from BrazilBank
	public void mutualFund() {
		System.out.println("mutualFund method");
		
	}

	}
