package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Store {
	public static final int MAX_NUMBER_DVD = 100;
	private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_NUMBER_DVD];
	private int currentQty = 0;
	
	public void addDVD(DigitalVideoDisc disc) {
		if (this.currentQty < MAX_NUMBER_DVD) {
			this.itemsInStore[this.currentQty] = disc;
			this.currentQty += 1;
			System.out.println("Add successed!");
		}else {
			System.out.println("Max number ordered!");
		}
	}
	public int findDVD(DigitalVideoDisc disc) {
		int res = -1;
		for (int i=0;i<this.currentQty;i++) {
			if (this.itemsInStore[i].equals(disc)) {
				res = i;
			}
		}
		if (res == -1) {
			System.out.println("Not found");
		}
		return res;
	}
	public void removeDVD(DigitalVideoDisc disc) {
		int idx = this.findDVD(disc);
		if (idx == -1) {
			System.out.println("Can't delete!");
		}else {
			for (int j=idx;j<this.currentQty-1;j++) {
				this.itemsInStore[j] = this.itemsInStore[j+1];
			}
			this.itemsInStore[this.currentQty-1] = null;
			this.currentQty -= 1;
			System.out.println("Delete success");
			System.out.println("Current quantity: " + this.currentQty);
		}
	}
	
}
