package Factory;

public interface IContBancar {
	
	void transfer(IContBancar destinatie, int suma);
	void depune(int suma);

}
