package ro.ase.cts.seminar4.classes;

public class ShoppingCart {
	
	private static ShoppingCart instance = null;
	
	private ShoppingCart() {}

	public static ShoppingCart getInstance() {
		if(instance == null)	{
			instance = new ShoppingCart();
		}
		return instance;
	}
	
	

}
