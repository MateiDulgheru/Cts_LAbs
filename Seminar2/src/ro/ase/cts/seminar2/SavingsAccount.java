package ro.ase.cts.seminar2;
import ro.ase.cts.seminar2.BankAccount;
import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsuficientFundsException;
import ro.ase.cts.seminar2.interfaces.Profitable;
import ro.ase.cts.seminar2.SavingsAccount;

public class SavingsAccount extends BankAccount implements Profitable
{

	@Override
	public void deposit(double amount) 
	{
		// TODO Auto-generated method stub
		this.setBalance(this.getBalance()+amount);
	}

	@Override
	public void withdraw(double amount) throws InsuficientFundsException 
	{
		// TODO Auto-generated method stub
		if(amount<=this.getBalance())
		{
			this.setBalance(this.getBalance()-amount);
		}
		
	}

	@Override
	public void transfer(double amount, Account destination)
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
