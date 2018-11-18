
public class BankAccount 
{
	
	//balance variable is declared in object scope
	double balance;
	
	//credit(double amount) is a method or behavior of an object
	//credit() method is also defined in object scope
	//double balance defined here is in method scope 
	//and does not collide with object scope's double balance.
	void credit(double balance)
	{
		//local scope
		int i = 10;
		
		if (i > 0)
		{//creating a block scope
			int y = 20;
		}
				
		if (i > 5)
		{
			int y = 50;
			System.out.println(i);
		}
		
		balance = balance + balance;
	}
	
	
	//debit() method is defined in object scope
	void debit(double amount) 
	{
		//i cannot be accessed from credit() as it is in different scope
		System.out.println(i);
		balance = balance - amount;
	}

}








