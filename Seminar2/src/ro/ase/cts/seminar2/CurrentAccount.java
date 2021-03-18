package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsuficientFundsException;
import ro.ase.cts.seminar2.interfaces.Depositable;
import ro.ase.cts.seminar2.interfaces.NotificationService;
import ro.ase.cts.seminar2.interfaces.Profitable;
import ro.ase.cts.seminar2.interfaces.Transferable;
import ro.ase.cts.seminar2.interfaces.Withdrawable;

public class CurrentAccount extends BankAccount implements Depositable, Withdrawable, Transferable
{
	public static double MAX_CREDIT=5000;
	public NotificationService notificationService;

	
	
	public NotificationService getNotificationService() {
		return notificationService;
	}

	public void setNotificationService(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

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
		this.notificationService.sendNotification("S-a extras suma de: " + amount);
		
	}

	@Override
	public void transfer(double amount, Depositable destination) throws IllegalTransferException, InsuficientFundsException 
	{
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

	public CurrentAccount() {	super();	}

	public CurrentAccount(double balance, String iban)
	{
		super(balance, iban);	
	}
	
	
	
}
