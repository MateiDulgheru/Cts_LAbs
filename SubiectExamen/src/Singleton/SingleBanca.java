package Singleton;

import Factory.ContCredit;
import Factory.ContDebit;
import Factory.IContBancar;

public class SingleBanca {

	private String denumire;
	private String adresa;
	private static int NRCONT;
	
	private static SingleBanca INSTANCE;

	public SingleBanca(String denumire, String adresa) {
		super();
		this.denumire = denumire;
		this.adresa = adresa;
	}
	
	public static synchronized SingleBanca getInstance(String denumire, String adresa)
	{
		if(INSTANCE==null)
			INSTANCE=new SingleBanca(denumire, adresa);
		return INSTANCE;
	}
	
	public IContBancar createInstance(String tipCont)
	{
		IContBancar contBancar;
		
		switch (tipCont) {
		case "CREDIT":
			contBancar=new ContCredit();
			NRCONT++;
			break;
		case "DEBIT" : 
			contBancar=new ContDebit();
			NRCONT++;
			break;
			

		default:
			contBancar= null;
			break;
		}
		return contBancar;
	}
}
