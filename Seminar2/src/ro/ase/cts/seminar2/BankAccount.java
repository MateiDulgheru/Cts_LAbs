package ro.ase.cts.seminar2;

public abstract class BankAccount extends Account
{
	private double balance;
	private String iban;
	
	
	
	public BankAccount() 
	{
		//super();
		this.balance=0;
		this.setIban("");
	}

	public BankAccount(double balance, String iban) 
	{
		//super();
		this.balance = balance;
		this.setIban(iban);
	}
	
	



	public void setBalance(double balance) 
	{
		this.balance = balance;
	}

	@Override
	public double getBalance() { return this.balance; }

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}
	
	
	
}
