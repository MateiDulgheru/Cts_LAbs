package ro.ase.cts.seminar6.main;

import java.util.Scanner;

import ro.ase.cts.seminar6.builder.AbstractProductFactory;
import ro.ase.cts.seminar6.builder.OfficeProduct;
import ro.ase.cts.seminar6.builder.Product;
import ro.ase.cts.seminar6.builder.ProductFactory;
import ro.ase.cts.seminar6.builder.TechProduct;
import ro.ase.cts.seminar6.builder.TechProductFactory;
import ro.ase.cts.seminar6.singleton.Cart;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart myShoppingCart = Cart.getInstance("shopping");
		
		//TechProduct smartphone = new TechProduct();
		
		//Product smartphone = new TechProduct();
		//Product paperClip = new OfficeProduct();
		//myShoppingCart.products.add(smartphone);
		//myShoppingCart.products.add(paperClip);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Selectati categoria de produse:\n tech-Produse tech \n office - Produse office");
		String userPreference = scan.nextLine();
		Product myProduct = null;
		
		AbstractProductFactory productFactory = null;
		
		if(userPreference != null)
		{
			if(userPreference.equalsIgnoreCase("tech"))
			{
				productFactory = new TechProductFactory();
			}
		}
		
		System.out.println(productFactory.getCatalog());
		//userPreference = scan.nextLine();
		
		for(int i =0; i<2; i++)
		{
			userPreference = scan.nextLine();
			try {
			int selectedId = Integer.valueOf(userPreference);
			if(myShoppingCart.products.isEmpty())
			{
				myProduct = productFactory.makeProduct(selectedId);
			}
			for(Product p : myShoppingCart.products)
			{
				if(p instanceof TechProduct)
				{
					TechProduct tempProduct = (TechProduct)p;
					
					if(tempProduct.getId() == selectedId)
					{
						try {
							myProduct =(Product) tempProduct.clone();
						} catch (CloneNotSupportedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}else {
						myProduct=productFactory.makeProduct(selectedId);
					}
				}
				
			}
			
			
			myProduct = productFactory.makeProduct(selectedId);
			
			}catch(NumberFormatException e){
				System.err.println("selectie invalida");
			}
			
			
			if(myProduct != null) {
				myShoppingCart.products.add(myProduct);
			}
		
		}
		
		for(Product p:myShoppingCart.products)
		{
			System.out.println(p.getDescription());
		}
		
		
	}

}
