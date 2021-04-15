package ro.ase.cts.seminar8.main;

import javax.swing.border.EtchedBorder;

import ro.ase.cts.seminar8.composite.CatalogComponent;
import ro.ase.cts.seminar8.composite.Product;
import ro.ase.cts.seminar8.composite.ProductCatalog;
import ro.ase.cts.seminar8.decorator.AbstractBackpack;
import ro.ase.cts.seminar8.decorator.Backpack;
import ro.ase.cts.seminar8.decorator.WithFoodDecorator;
import ro.ase.cts.seminar8.decorator.WithLaptopDecorator;
import ro.ase.cts.seminar8.facade.OrderFacade;

public class Main8 {

	public static void main(String[] args) {
		
		OrderFacade facade = new OrderFacade();
		facade.order();
		System.out.println("-------------------------------------");
		
		
		
		CatalogComponent laptop=new Product("ASUS", 2000);
		CatalogComponent smartPhone=new Product("Samsung S8", 500);
		CatalogComponent techProductsCatalog=new ProductCatalog("Tech products");
		techProductsCatalog.add(laptop);
		techProductsCatalog.add(smartPhone);
		
		CatalogComponent officeProductCatalog=new ProductCatalog("Office products");
		CatalogComponent paperClip=new Product("PaperClip", 5);
		CatalogComponent pen=new Product("Blue Pen", 2);
		officeProductCatalog.add(pen);
		officeProductCatalog.add(paperClip);
		
		CatalogComponent genericProducts=new ProductCatalog("Generic products");
		genericProducts.add(new Product("Generic Product", 0));
		genericProducts.add(techProductsCatalog);
		genericProducts.add(officeProductCatalog);
		
		
		System.out.println(genericProducts);
		
		System.out.println("-------------------------------------");
		
		AbstractBackpack myBackpack=new Backpack();
		myBackpack.pack();
		AbstractBackpack decoratedBackpack=new WithLaptopDecorator(new WithFoodDecorator(myBackpack,"banana"));
		decoratedBackpack.pack();
	}

}
