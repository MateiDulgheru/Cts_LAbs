package ro.ase.cts.seminar2;

public class CurrentAccount extends BankAccount
{
	public static double MAX_CREDIT=5000;
	

	@Override
	public void deposit(double amount) 
	{
		this.setBalance(this.getBalance()+amount);
		
	}

	@Override
	public void withdraw(double amount) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transfer(double amount, Account account) 
	{
		// TODO Auto-generated method stub
		
	}

	public CurrentAccount() {	super();	}

	public CurrentAccount(double balance, String iban)
	{
		super(balance, iban);	
	}
	
	
	
}
