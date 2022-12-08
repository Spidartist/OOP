package hust.soict.dsai.aims.cart;
import java.util.ArrayList;
import java.util.Scanner;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public void addMedia(Media media) {
		if (this.itemsOrdered.size() < MAX_NUMBER_ORDERED) {
			this.itemsOrdered.add(media);
			System.out.println("Add successed!");
		}else {
			System.out.println("Max number ordered!");
		}
	}
	
	public void removeMedia(Media media) {
		this.itemsOrdered.remove(media);
		System.out.println("Delete success");
		System.out.println("Current quantity: " + this.itemsOrdered.size());

	}
	public float totalCost() {
		float res = 0.0f;
		for (int i=0;i<this.itemsOrdered.size();i++) {
			res += this.itemsOrdered.get(i).getCost();
		}
		return res;
	}
	
	public void printCart() {
		System.out.println("***********************CART***********************\nOrdered Items:\n");
		for (int i=0;i<this.itemsOrdered.size();i++) {
			System.out.println(Integer.toString(this.itemsOrdered.get(i).getId())+". "+this.itemsOrdered.get(i).toString());
		}
		System.out.println("Total cost: " + Float.toString(this.totalCost())+"\n");
		System.out.println("***************************************************\n");
	}
	
	public void searchTitle() {
		Scanner sc= new Scanner(System.in);    
		System.out.print("Enter the title: ");  
		String title = sc.nextLine(); 
		for (int i=0;i<this.itemsOrdered.size();i++) {
			if (this.itemsOrdered.get(i) instanceof DigitalVideoDisc) {
				DigitalVideoDisc dvd = (DigitalVideoDisc)this.itemsOrdered.get(i);
				if (dvd.isMatch(title)) {
					System.out.println(dvd.toString());
				}
			}
		}
	}
	
	public void searchId() {
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter the Id: ");  
		int id = sc.nextInt();  
		for (int i=0;i<this.itemsOrdered.size();i++) {
			if (this.itemsOrdered.get(i) instanceof DigitalVideoDisc) {
				DigitalVideoDisc dvd = (DigitalVideoDisc)this.itemsOrdered.get(i);
				if (dvd.getId() == id) {
					System.out.println(dvd.toString());
					break;
				}
			}
		}
		sc.close();
	}
	
	
}
