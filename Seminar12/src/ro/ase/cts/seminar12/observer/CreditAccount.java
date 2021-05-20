package ro.ase.cts.seminar12.observer;



import ro.ase.cts.seminar12.observer.IllegalTransferException;
import ro.ase.cts.seminar12.observer.InsuficientFundsException;
import ro.ase.cts.seminar12.observer.Depositable;
import ro.ase.cts.seminar12.observer.Transferable;
import ro.ase.cts.seminar12.observer.Withdrawable;

public class CreditAccount extends BankAccount implements Depositable, Withdrawable {
	
	public CreditAccount(double balance, String iban) 
	{
		super(balance,iban);
	}
	
	
	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		if(amount > 0) {
			this.setBalance(this.getBalance()+amount);
		}
		
	}

	@Override
	public void withdraw(double amount) throws InsuficientFundsException {
		// TODO Auto-generated method stub
		//metoda notificare observatorii
		if(amount<=this.getBalance()) {
			this.setBalance(this.getBalance()-amount);
		}
		for(NotificationInterface observer:this.observers)
		{
			observer.notifyUser(amount);
		}
		
	}

}
