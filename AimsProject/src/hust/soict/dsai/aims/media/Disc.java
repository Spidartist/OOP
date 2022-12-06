package hust.soict.dsai.aims.media;

public class Disc extends Media {
	private String director;
	private int length;
	
	public Disc(String title){
		this.setTitle(title);
		this.setCategory("Unknown");
		this.setCost(0.0f);
		this.director = "Anonymous";
		this.length = 0;
	}
	
	public Disc(String title, String category, float cost){
		this.setTitle(title);
		this.setCategory("Unknown");
		this.setCost(cost);
		this.director = "Anonymous";
		this.length = 0;
	}
	
	public Disc(String title, String category, String director, float cost){
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
		this.director = director;
	}

	public Disc(String title, String category, String director, int length, float cost){
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
		this.director = director;
		this.length = length;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}

}
