package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private static int QUANTITY = 0;
	private List<String> authors = new ArrayList<String>();
	
	public Book(String title, float cost, String category, List<String> authors) {
		Book.QUANTITY += 1;
		this.setId(Book.QUANTITY);
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
		this.authors = authors;
	}
	
	public Book(String title, float cost, String category) {
		Book.QUANTITY += 1;
		this.setId(Book.QUANTITY);
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
		List<String> authors = new ArrayList<String>();
		authors.add("Unknown");
		this.authors = authors;
	}	
	
	public Book(String title, float cost) {
		Book.QUANTITY += 1;
		this.setId(Book.QUANTITY);
		this.setTitle(title);
		this.setCategory("Unknown");
		this.setCost(cost);
		List<String> authors = new ArrayList<String>();
		authors.add("Unknown");
		this.authors = authors;
	}
	
	
	public void addAuthor(String authorName) {
		if (authors.contains(authorName)) {
			return;
		}else {
			authors.add(authorName);
		}
	}
	
	public void removeAuthor(String authorName) {
		if (authors.contains(authorName)) {
			authors.remove(authorName);
		}else {
			System.out.println("Not contain that author!!!");
		}
	}

}
