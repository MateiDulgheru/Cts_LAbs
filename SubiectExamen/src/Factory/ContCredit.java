package Factory;

public class ContCredit implements IContBancar{

	private double total=1000;

	@Override
	public void transfer(IContBancar destinatie, int suma) {
		total-=suma;
		// TODO Auto-generated method stub
		destinatie.depune(suma);
		System.out.println("Transfer Efectuat in Credit");
		
	}

	@Override
	public void depune(int suma) {
		// TODO Auto-generated method stub
		total+=suma;
		System.out.println("Transferul a fost primit in Credit");
	}

}
