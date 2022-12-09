package hust.soict.dsai.aims;
import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;

public class Aims {
	
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	
	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	
	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	
	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}

	
	public static void main(String[] args) {
		Store store = new Store();
		Cart anOrder = new Cart();
		int choice = -1;
		while (choice != 0) {
			showMenu();
			Scanner sc= new Scanner(System.in);  
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				int storeChoice = -1;
				while (storeChoice != 0) {
					storeMenu();
					Scanner sc1 = new Scanner(System.in);  
					storeChoice = sc1.nextInt();
					switch (storeChoice) {
					case 1: {
						int detailChoice = -1;
						while (detailChoice != 0) {
							Scanner sc2 = new Scanner(System.in); 
							String titleMedia = sc2.nextLine();
							Media found = null;
							for (Media media: store.getItemsInStore()) {
								if (media.getTitle().contains(titleMedia)) {
									found = media;
									System.out.println(media.toString());
									break;
								}
							}
							mediaDetailsMenu(); 
							detailChoice = sc2.nextInt();
							switch (detailChoice) {
							case 1: {
								if (found instanceof DigitalVideoDisc) {
									DigitalVideoDisc media = (DigitalVideoDisc)found;
									System.out.println("Add success DVD");
								}
								if (found instanceof Book) {
									Book media = (Book)found;
									System.out.println("Add success Book");
								}
								if (found instanceof CompactDisc) {
									CompactDisc media = (CompactDisc)found;
									System.out.println("Add success CD");
								}
								break;
							}
							case 2: {
								if (found instanceof DigitalVideoDisc) {
									DigitalVideoDisc media = (DigitalVideoDisc)found;
									media.play();
								}
								if (found instanceof Book) {
									Book media = (Book)found;
									System.out.println("Book can't play");
								}
								if (found instanceof CompactDisc) {
									CompactDisc media = (CompactDisc)found;
									media.play();
								}
								break;
							}
							case 0: {
								break;
							}
							default:
								detailChoice = 0;
								break;
							}
						}
						break;
					}
					case 2: {
						Scanner sc4 = new Scanner(System.in); 
						String titleMedia = sc4.nextLine();
						Media found = null;
						for (Media media: store.getItemsInStore()) {
							if (media.getTitle().contains(titleMedia)) {
								found = media;
								System.out.println(media.toString());
								break;
							}
						}
						if (found instanceof DigitalVideoDisc) {
							DigitalVideoDisc media = (DigitalVideoDisc)found;
							System.out.println("Add success DVD");
						}
						if (found instanceof Book) {
							Book media = (Book)found;
							System.out.println("Add success Book");
						}
						if (found instanceof CompactDisc) {
							CompactDisc media = (CompactDisc)found;
							System.out.println("Add success CD");
						}
						break;
					}
					case 3: {
						Scanner sc5 = new Scanner(System.in); 
						String titleMedia = sc5.nextLine();
						Media found = null;
						for (Media media: store.getItemsInStore()) {
							if (media.getTitle().contains(titleMedia)) {
								found = media;
								System.out.println(media.toString());
								break;
							}
						}
						if (found instanceof DigitalVideoDisc) {
							DigitalVideoDisc media = (DigitalVideoDisc)found;
							media.play();
						}
						if (found instanceof Book) {
							Book media = (Book)found;
							System.out.println("Book can't play");
						}
						if (found instanceof CompactDisc) {
							CompactDisc media = (CompactDisc)found;
							media.play();
						}
						break;
					}
					case 4: {
						int cartChoice = -1;
						while (cartChoice != 0) {
							cartMenu();
							Scanner sc3 = new Scanner(System.in);  
							cartChoice = sc3.nextInt();
							switch (cartChoice) {
							case 1: {
								int filterChoice;
								System.out.println("1.Filter by ID\n2.Filter by title");
								Scanner sc6 = new Scanner(System.in);  
								filterChoice = sc6.nextInt();
								if (filterChoice == 1) {
									int id = sc6.nextInt();
									Media found = anOrder.getItemsOrdered().get(id);
									if (found instanceof DigitalVideoDisc) {
										DigitalVideoDisc media = (DigitalVideoDisc)found;
										System.out.println(media.toString());
									}
									if (found instanceof Book) {
										Book media = (Book)found;
										System.out.println("Book can't play");
									}
									if (found instanceof CompactDisc) {
										CompactDisc media = (CompactDisc)found;
										System.out.println(media.toString());
									}
								}else if (filterChoice == 2) {
									String title = sc6.nextLine();
									for (Media media: store.getItemsInStore()) {
										if (media.getTitle().contains(title)) {
											Media found = media;
											if (found instanceof DigitalVideoDisc) {
												DigitalVideoDisc media1 = (DigitalVideoDisc)found;
												System.out.println(media1.toString());
											}
											if (found instanceof Book) {
												Book media1 = (Book)found;
												System.out.println(media1.toString());
											}
											if (found instanceof CompactDisc) {
												CompactDisc media1 = (CompactDisc)found;
												System.out.println(media1.toString());
											}
										}
									}
								}else {
									System.out.println("Error!!!");
								}
								break;
							}
							case 2: {
								int choiceSort = -1;
								System.out.println("1.Sort by title\n2.Sort by cost");
								Scanner sc7 = new Scanner(System.in);  
								choiceSort = sc7.nextInt();
								while (choiceSort != 0) {
									switch (choiceSort) {
									case 1: {
										anOrder.sortCartByTitleCost();
										anOrder.printCart();
										break;
									}
									case 2: {
										anOrder.sortCartByCostTitle();
										anOrder.printCart();
										break;
									}
									default:
										choiceSort = 0;
										break;
									}
								}
								break;
							}
							case 3: {
								Scanner sc8 = new Scanner(System.in);  
								String title = sc8.nextLine();
								for (Media media: store.getItemsInStore()) {
									if (media.getTitle().contains(title)) {
										Media found = media;
										System.out.println("Remove " + found.getTitle());
										anOrder.getItemsOrdered().remove(found);
										break;
									}
								}
								break;
							}
							case 4: {
								Scanner sc9 = new Scanner(System.in);  
								String title = sc9.nextLine();
								for (Media media: store.getItemsInStore()) {
									if (media.getTitle().contains(title)) {
										Media found = media;
										if (found instanceof DigitalVideoDisc) {
											DigitalVideoDisc media1 = (DigitalVideoDisc)found;
											media1.play();
										}
										if (found instanceof Book) {
											Book media1 = (Book)found;
											System.out.println("Book can't play");
										}
										if (found instanceof CompactDisc) {
											CompactDisc media1 = (CompactDisc)found;
											media1.play();
										}
										break;
									}
								}
								break;
							}
							case 5: {
								System.out.println("Order success!!!");
								anOrder.getItemsOrdered().removeAll(anOrder.getItemsOrdered());
								break;
							}
							case 0: {
								break;
							}
							default:{
								cartChoice = 0;
								break;
							}
							}
						}
						break;
					}
					case 0: {
						break;
					}
					default:
						storeChoice = 0;
						break;
					}
				}
				break;
			}
			case 2: {
				Scanner sc10 = new Scanner(System.in);  
				int updateChoice = sc10.nextInt();
				while (updateChoice != 0) {
					System.out.println("1.Add new media/n2.Remove media");
					switch (updateChoice) {
					case 1: {
						System.out.println("Enter the title:");
						String title = sc10.nextLine();
						System.out.println("Enter the cost:");
						float cost = sc10.nextFloat();
						System.out.println("Enter the type of media(DVD, CD, Book):");
						String type = sc10.nextLine();
						if (type == "DVD") {
							DigitalVideoDisc dvd = new DigitalVideoDisc(title, cost);
						}else if (type == "CD") {
							CompactDisc cd = new CompactDisc(title, cost);
						}else if (type == "Book") {
							Book book = new Book(title, cost);
						}else {
							System.out.println("Not that type!!!");
						}
						break;
					}
					case 2: {
						Scanner sc11 = new Scanner(System.in);  
						String title = sc11.nextLine();
						for (Media media: store.getItemsInStore()) {
							if (media.getTitle().contains(title)) {
								Media found = media;
								System.out.println("Remove " + found.getTitle());
								store.getItemsInStore().remove(found);
							}
						}
						break;
					}
					default:
						updateChoice = 0;
						break;
					}
				}
				break;
			}
			case 3: {
				int cartChoice = -1;
				while (cartChoice != 0) {
					cartMenu();
					Scanner sc3 = new Scanner(System.in);  
					cartChoice = sc3.nextInt();
					switch (cartChoice) {
					case 1: {
						int filterChoice;
						System.out.println("1.Filter by ID\n2.Filter by title");
						Scanner sc6 = new Scanner(System.in);  
						filterChoice = sc6.nextInt();
						if (filterChoice == 1) {
							int id = sc6.nextInt();
							Media found = anOrder.getItemsOrdered().get(id);
							if (found instanceof DigitalVideoDisc) {
								DigitalVideoDisc media = (DigitalVideoDisc)found;
								System.out.println(media.toString());
							}
							if (found instanceof Book) {
								Book media = (Book)found;
								System.out.println("Book can't play");
							}
							if (found instanceof CompactDisc) {
								CompactDisc media = (CompactDisc)found;
								System.out.println(media.toString());
							}
						}else if (filterChoice == 2) {
							String title = sc6.nextLine();
							for (Media media: store.getItemsInStore()) {
								if (media.getTitle().contains(title)) {
									Media found = media;
									if (found instanceof DigitalVideoDisc) {
										DigitalVideoDisc media1 = (DigitalVideoDisc)found;
										System.out.println(media1.toString());
									}
									if (found instanceof Book) {
										Book media1 = (Book)found;
										System.out.println(media1.toString());
									}
									if (found instanceof CompactDisc) {
										CompactDisc media1 = (CompactDisc)found;
										System.out.println(media1.toString());
									}
								}
							}
						}else {
							System.out.println("Error!!!");
						}
						break;
					}
					case 2: {
						int choiceSort = -1;
						System.out.println("1.Sort by title\n2.Sort by cost");
						Scanner sc7 = new Scanner(System.in);  
						choiceSort = sc7.nextInt();
						while (choiceSort != 0) {
							switch (choiceSort) {
							case 1: {
								anOrder.sortCartByTitleCost();
								anOrder.printCart();
								break;
							}
							case 2: {
								anOrder.sortCartByCostTitle();
								anOrder.printCart();
								break;
							}
							default:
								choiceSort = 0;
								break;
							}
						}
						break;
					}
					case 3: {
						Scanner sc8 = new Scanner(System.in);  
						String title = sc8.nextLine();
						for (Media media: store.getItemsInStore()) {
							if (media.getTitle().contains(title)) {
								Media found = media;
								System.out.println("Remove " + found.getTitle());
								anOrder.getItemsOrdered().remove(found);
								break;
							}
						}
						break;
					}
					case 4: {
						Scanner sc9 = new Scanner(System.in);  
						String title = sc9.nextLine();
						for (Media media: store.getItemsInStore()) {
							if (media.getTitle().contains(title)) {
								Media found = media;
								if (found instanceof DigitalVideoDisc) {
									DigitalVideoDisc media1 = (DigitalVideoDisc)found;
									media1.play();
								}
								if (found instanceof Book) {
									Book media1 = (Book)found;
									System.out.println("Book can't play");
								}
								if (found instanceof CompactDisc) {
									CompactDisc media1 = (CompactDisc)found;
									media1.play();
								}
								break;
							}
						}
						break;
					}
					case 5: {
						System.out.println("Order success!!!");
						anOrder.getItemsOrdered().removeAll(anOrder.getItemsOrdered());
						break;
					}
					case 0: {
						break;
					}
					default:{
						cartChoice = 0;
						break;
					}
					}
				}
				break;
			}
			case 0: {
				break;
			}
			default:
				choice = 0;
				break;
			}
		}
		
		
	}
}
