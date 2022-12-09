package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class CartTest {
	public static void main(String[] args) {
		Cart cart = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
								"Animation", "Roger Aller", 87, 19.95f);
		System.out.println(dvd1.getId());
		cart.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		System.out.println(dvd2.getId());
		cart.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		System.out.println(dvd3.getId());
		cart.addMedia(dvd3);
		
		cart.printCart();
//		cart.searchTitle();
//		cart.searchId();
		cart.sortCartByCostTitle();
		cart.printCart();
		cart.sortCartByTitleCost();
		cart.printCart();
	}
}
