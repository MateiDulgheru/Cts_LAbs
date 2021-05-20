package ro.ase.cts.seminar12.observer;

import ro.ase.cts.seminar12.observer.InsuficientFundsException;

public interface Withdrawable {
	public void withdraw(double amount) throws InsuficientFundsException; 

}
