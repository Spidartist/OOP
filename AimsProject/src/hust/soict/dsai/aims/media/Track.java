package hust.soict.dsai.aims.media;

public class Track {
	private int length;
	private String title;
	public Track(String title, int length) {
		this.length = length;
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
