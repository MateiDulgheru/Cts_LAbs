package ro.ase.cts.seminar12.observer;

import ro.ase.cts.seminar12.observer.Account;
import ro.ase.cts.seminar12.observer.IllegalTransferException;
import ro.ase.cts.seminar12.observer.InsuficientFundsException;

public interface Transferable {

	public void transfer(double amount, Depositable destination) throws IllegalTransferException, InsuficientFundsException ;
}
