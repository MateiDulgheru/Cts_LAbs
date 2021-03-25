package ro.ase.cts.seminar5.Factory;

public class OfficeProduct implements Product {

	String productName;
	
	
	
	public OfficeProduct(String productName) {
		super();
		this.productName = productName;
	}



	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "This is an office product";
	}

}
