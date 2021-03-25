package ro.ase.cts.seminar5.Factory;

public class TechProduct implements Product {

	String productName;
	private TechProduct() {
		
		
	}
	
	public TechProduct(String productName) {
		
		super();
		this.productName=productName;
		
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "This is a tech product";
	}

}
