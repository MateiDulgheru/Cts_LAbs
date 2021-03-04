package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsuficientFundsException;

public class CurrentAccount extends BankAccount
{
	public static double MAX_CREDIT=5000;
	

	@Override
	public void deposit(double amount) 
	{
		this.setBalance(this.getBalance()+amount);
		
	}

	@Override
	public void withdraw(double amount) throws InsuficientFundsException 
	{
		if(this.getBalance()>=amount)
		{		
			this.setBalance(this.getBalance()-amount); 
		}
		else
		{
			throw new InsuficientFundsException("Fonduri insuficiente!");
		}
		
	}

	@Override
	public void transfer(double amount, Account destination) throws IllegalTransferException, InsuficientFundsException 
	{
		if(((BankAccount)destination).iban.equals(this.iban))
		{
			throw new IllegalTransferException("Cod IBAN identic");
		}
		else
		{
			this.withdraw(amount);
			destination.deposit(amount);
		}
		
	}

	public CurrentAccount() {	super();	}

	public CurrentAccount(double balance, String iban)
	{
		super(balance, iban);	
	}
	
	
	
}
