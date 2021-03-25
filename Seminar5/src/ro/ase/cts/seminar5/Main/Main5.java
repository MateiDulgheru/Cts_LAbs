package ro.ase.cts.seminar5.Main;

import java.util.Scanner;

import ro.ase.cts.seminar5.Factory.OfficeProduct;
import ro.ase.cts.seminar5.Factory.Product;
import ro.ase.cts.seminar5.Factory.ProductFactory;
import ro.ase.cts.seminar5.Factory.TechProduct;
import ro.ase.cts.seminar5.Singleton.Cart;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart myShoppingCart = Cart.getInstance("shopping");
		
		//TechProduct smartphone = new TechProduct();
		
		//Product smartphone = new TechProduct();
		//Product paperClip = new OfficeProduct();
		//myShoppingCart.products.add(smartphone);
		//myShoppingCart.products.add(paperClip);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Catalog produse:\n tech-Produse tech \n office - Produse office");
		String userPreference = scan.nextLine();
		Product myProduct = null;
		
		ProductFactory productFactory = new ProductFactory();
		myProduct = productFactory.makeProduct(userPreference, "generic");
		/*} else {
			System.out.println("Optiune invalida");
			System.out.println("Catalog produse:\n tech-Produse tech \n office - Produse office");
		}*/
		
		if(myProduct != null) {
			myShoppingCart.products.add(myProduct);
		}
		
		for(Product p:myShoppingCart.products)
		{
			System.out.println(p.getDescription());
		}
		
		
	}

}
