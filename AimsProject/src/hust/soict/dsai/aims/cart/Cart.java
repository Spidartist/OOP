package hust.soict.dsai.aims.cart;
import java.util.Scanner;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered = 0;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (this.qtyOrdered < MAX_NUMBER_ORDERED) {
			this.itemsOrdered[this.qtyOrdered] = disc;
			this.qtyOrdered += 1;
			System.out.println("Add successed!");
		}else {
			System.out.println("Max number ordered!");
		}
	}
	public int findDigitalVideoDisc(DigitalVideoDisc disc) {
		int res = -1;
		for (int i=0;i<this.qtyOrdered;i++) {
			if (this.itemsOrdered[i].equals(disc)) {
				res = i;
			}
		}
		if (res == -1) {
			System.out.println("Not found");
		}
		return res;
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int idx = this.findDigitalVideoDisc(disc);
		if (idx == -1) {
			System.out.println("Can't delete!");
		}else {
			for (int j=idx;j<this.qtyOrdered-1;j++) {
				this.itemsOrdered[j] = this.itemsOrdered[j+1];
			}
			this.itemsOrdered[this.qtyOrdered-1] = null;
			this.qtyOrdered -= 1;
			System.out.println("Delete success");
			System.out.println("Current quantity: " + this.qtyOrdered);
		}
	}
	public float totalCost() {
		float res = 0.0f;
		for (int i=0;i<this.qtyOrdered;i++) {
			res += this.itemsOrdered[i].getCost();
		}
		return res;
	}
	
	public void printCart() {
		System.out.println("***********************CART***********************\nOrdered Items:\n");
		for (int i=0;i<this.qtyOrdered;i++) {
			System.out.println(Integer.toString(this.itemsOrdered[i].getId())+". "+this.itemsOrdered[i].toString());
		}
		System.out.println("Total cost: " + Float.toString(this.totalCost())+"\n");
		System.out.println("***************************************************\n");
	}
	
	public void searchTitle() {
		Scanner sc= new Scanner(System.in);    
		System.out.print("Enter the title: ");  
		String title = sc.nextLine(); 
		for (int i=0;i<this.qtyOrdered;i++) {
			if (this.itemsOrdered[i].isMatch(title)) {
				System.out.println(this.itemsOrdered[i].toString());
			}
		}
	}
	
	public void searchId() {
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter the Id: ");  
		int id = sc.nextInt();  
		for (int i=0;i<this.qtyOrdered;i++) {
			if (this.itemsOrdered[i].getId() == id) {
				System.out.println(this.itemsOrdered[i].toString());
				break;
			}
		}
		sc.close();
	}
	
	
}
