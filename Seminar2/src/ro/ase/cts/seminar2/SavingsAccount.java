package ro.ase.cts.seminar2;
import ro.ase.cts.seminar2.BankAccount;
import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsuficientFundsException;
import ro.ase.cts.seminar2.interfaces.Depositable;
import ro.ase.cts.seminar2.interfaces.Profitable;
import ro.ase.cts.seminar2.interfaces.Transferable;
import ro.ase.cts.seminar2.interfaces.Withdrawable;
import ro.ase.cts.seminar2.SavingsAccount;

public class SavingsAccount extends BankAccount implements Profitable, Depositable, Withdrawable, Transferable
{

	
	public void deposit(double amount) 
	{
		// TODO Auto-generated method stub
		this.setBalance(this.getBalance()+amount);
	}

	
	public void withdraw(double amount) throws InsuficientFundsException 
	{
		// TODO Auto-generated method stub
		if(amount<=this.getBalance())
		{
			this.setBalance(this.getBalance()-amount);
		}
		
	}

	
	public void transfer(double amount, Depositable destination)
			throws IllegalTransferException, InsuficientFundsException
	{
		// TODO Auto-generated method stub
		if(((BankAccount)destination).getIban().equals(this.getIban()))
		{
			throw new IllegalTransferException("Cod IBAN identic");
		}
		else
		{
			this.withdraw(amount);
			destination.deposit(amount);
		}
		
	}

	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(double balance, String iban) {
		super(balance, iban);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addInterest(double interest) 
	{
		// TODO Auto-generated method stub
		this.setBalance(this.getBalance()+interest);
		
	}

}
