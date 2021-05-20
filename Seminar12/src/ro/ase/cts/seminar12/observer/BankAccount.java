package ro.ase.cts.seminar12.observer;

import java.util.ArrayList;

public abstract class BankAccount extends Account
{
	
	protected ArrayList<NotificationInterface> observers;
	private double balance;
	private String iban;
	
	
	
	public BankAccount() 
	{
		//super();
		this.observers=new ArrayList<>();
		this.balance=0;
		this.setIban("");
	}

	public BankAccount(double balance, String iban) 
	{
		//super();
		this.observers=new ArrayList<>();
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
	
	
	public void addObserver(NotificationInterface observer)
	{
		this.observers.add(observer);
	}
	
	public void removeObserver(NotificationInterface observer)
	{
		this.observers.remove(observer);
	}
	
	
}
