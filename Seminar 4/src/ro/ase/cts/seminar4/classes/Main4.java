package ro.ase.cts.seminar4.classes;

import ro.ase.cts.seminar4.classes.EagerShoppingCartExample;

public class Main4 {
	
	public static void main(String[] args)
	{
		Cart shoppingCart=Cart.getInstance("shoppingCart");
		shoppingCart.getProducts();
		
		Cart wishList = Cart.getInstance("wishList");
		wishList.getProducts();
		
		
		
		
		
		
		
		//exemple singleton
		EagerShoppingCartExample example = EagerShoppingCartExample.INSTANCE;
		EagerShoppingCartExample example2 = EagerShoppingCartExample.INSTANCE;
		
		if(example == example2 )
		{
			System.out.println("Obietele sunt identice");
		}
		
		SingletonEnum mySingleton = SingletonEnum.INSTANCE;
		mySingleton.getProducts();
	}

}
