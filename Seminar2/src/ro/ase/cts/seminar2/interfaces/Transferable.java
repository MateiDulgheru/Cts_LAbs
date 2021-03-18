package ro.ase.cts.seminar2.interfaces;

import ro.ase.cts.seminar2.Account;
import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsuficientFundsException;

public interface Transferable {

	public void transfer(double amount, Depositable destination) throws IllegalTransferException, InsuficientFundsException ;
}
