package OOPsConcepts;

public interface USBank {

	int min_bal = 100;
	
	public void credit();
	public void debit();
	public void transferMoney();
	
	
	//Interface:
	//only method declaration
	//no method body - only method prototype
	//in interface we can declare the variables, vars are bydefault static in nature
	//var values will not be changed, it is final/constant in nature
	//no static method in interface
	//no main method method in interface
	//we can not create the object of the interface
	//interface is abstract in nature
	
}
