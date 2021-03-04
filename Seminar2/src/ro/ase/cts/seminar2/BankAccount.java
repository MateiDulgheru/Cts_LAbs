package ro.ase.cts.seminar2;

public abstract class BankAccount extends Account
{
	private double balance;
	protected String iban;
	
	
	
	public BankAccount() 
	{
		//super();
		this.balance=0;
		this.iban="";
	}

	public BankAccount(double balance, String iban) 
	{
		//super();
		this.balance = balance;
		this.iban = iban;
	}
	
	



	public void setBalance(double balance) 
	{
		this.balance = balance;
	}

	@Override
	public double getBalance() { return this.balance; }
	
	
	
}
