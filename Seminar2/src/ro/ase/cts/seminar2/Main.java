package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsuficientFundsException;

public class Main {

	public static void main(String[] args) 
	{
		CurrentAccount currentAccount =new CurrentAccount(300, "IBAN1");
		System.out.println("Suma din cont este: "+currentAccount.getBalance());
		System.out.println("Creditul maxim pentru cont este "+CurrentAccount.MAX_CREDIT);
		currentAccount.deposit(200);
		System.out.println("Suma din cont este: "+currentAccount.getBalance());
		
		try {
			currentAccount.withdraw(300);
		} catch (InsuficientFundsException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
		System.out.println("Suma din cont este: "+currentAccount.getBalance());
		
		CurrentAccount account2=new CurrentAccount(200,"IBAN2");
		try {
			currentAccount.withdraw(100);
			currentAccount.transfer(100, account2);
		} catch (InsuficientFundsException | IllegalTransferException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
		System.out.println("Suma disponibila este: "+currentAccount.getBalance());
		System.out.println("Suma din contul 2: "+account2.getBalance());
		
		SavingsAccount account3=new SavingsAccount(300,"IBAN3");
		account3.addInterest(10);
		System.out.println("suma in contul3 este: " + account3.getBalance());
		
		Bank banca=new Bank();
		
		BankAccount account4=banca.openBankAccount(AccountType.CURRENT);
		
	}

}
