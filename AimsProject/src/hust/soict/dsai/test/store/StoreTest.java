package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
	public static void main(String[] args) {
		Store store = new Store();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
								"Animation", "Roger Aller", 87, 19.95f);
		System.out.println(dvd1.getId());
		store.addDVD(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		System.out.println(dvd2.getId());
		store.addDVD(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		System.out.println(dvd3.getId());
		store.addDVD(dvd3);
		
		store.removeDVD(dvd3);
		
	}
}
