package Adapter;

import Factory.IContBancar;

public class AdapterCont implements IBankAccount, IContBancar {
	
	private double total = 5000;

	@Override
	public void accountTransfer(IBankAccount account, double amount) {
		
		this.transfer(this, (int) amount);
		
	}

	@Override
	public void transfer(IContBancar destinatie, int suma) {

		total-=suma;
		destinatie.depune(suma);
		System.out.println("Transfer adapter");
		
	}

	@Override
	public void depune(int suma) {
		
		
	}

}
