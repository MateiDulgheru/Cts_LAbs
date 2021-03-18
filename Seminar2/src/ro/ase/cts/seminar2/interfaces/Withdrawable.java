package ro.ase.cts.seminar2.interfaces;

import ro.ase.cts.seminar2.exceptii.InsuficientFundsException;

public interface Withdrawable {
	public void withdraw(double amount) throws InsuficientFundsException; 

}
