
public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	DigitalVideoDisc(String title){
		this.title = title;
		this.category = "Unknown";
		this.cost = 0.0f;
		this.director = "Anonymous";
		this.length = 0;
	}
	
	DigitalVideoDisc(String title, String category, float cost){
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.director = "Anonymous";
		this.length = 0;
	}
	
	DigitalVideoDisc(String title, String category, String director, float cost){
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.director = director;
	}

	DigitalVideoDisc(String title, String category, String director, int length, float cost){
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.director = director;
		this.length = length;
	}
	
	public boolean equals(DigitalVideoDisc disc) {
		if (this.title.equals(disc.title) && this.category.equals(disc.category) &&
			this.director.equals(disc.director) && this.length == disc.length && this.cost == disc.cost) {
			return true;
		}
		return false;
	}
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	
}
