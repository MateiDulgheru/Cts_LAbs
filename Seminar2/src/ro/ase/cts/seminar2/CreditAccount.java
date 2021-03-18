package ro.ase.cts.seminar2;

import javax.sql.rowset.spi.TransactionalWriter;

import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsuficientFundsException;
import ro.ase.cts.seminar2.interfaces.Depositable;
import ro.ase.cts.seminar2.interfaces.Transferable;
import ro.ase.cts.seminar2.interfaces.Withdrawable;

public class CreditAccount extends BankAccount implements Depositable, Withdrawable {

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
		if(amount<=this.getBalance()) {
			this.setBalance(this.getBalance()-amount);
		}
		
	}

}
