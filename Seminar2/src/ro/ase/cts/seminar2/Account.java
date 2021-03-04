package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsuficientFundsException;

public abstract class Account 
{
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount) throws InsuficientFundsException; 
	public abstract void transfer(double amount, Account destination) throws IllegalTransferException, InsuficientFundsException ;
	public abstract double getBalance();
	
}
