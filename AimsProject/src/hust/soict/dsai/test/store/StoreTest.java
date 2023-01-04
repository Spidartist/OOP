package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
	public static void main(String[] args) {
		Store store = new Store();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
								"Animation", "Roger Aller", 87, 19.95f);
		System.out.println(dvd1.getId());
		store.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		System.out.println(dvd2.getId());
		store.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		System.out.println(dvd3.getId());
		store.addMedia(dvd3);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Aller", 87, 19.95f);
		System.out.println(dvd4.getId());
		store.addMedia(dvd4);
		
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Star Wars",
		"Science Fiction", "George Lucas", 87, 24.95f);
		System.out.println(dvd5.getId());
		store.addMedia(dvd5);
		
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Aladin",
		"Animation", 18.99f);
		System.out.println(dvd6.getId());
		store.addMedia(dvd6);
		
		DigitalVideoDisc dvd7 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Aller", 87, 19.95f);
		System.out.println(dvd7.getId());
		store.addMedia(dvd7);
		
		DigitalVideoDisc dvd8 = new DigitalVideoDisc("Star Wars",
		"Science Fiction", "George Lucas", 87, 24.95f);
		System.out.println(dvd8.getId());
		store.addMedia(dvd8);
		
		DigitalVideoDisc dvd9 = new DigitalVideoDisc("Aladin",
		"Animation", 18.99f);
		System.out.println(dvd9.getId());
		store.addMedia(dvd9);
		
		store.removeMedia(dvd3);
		
	}
}
