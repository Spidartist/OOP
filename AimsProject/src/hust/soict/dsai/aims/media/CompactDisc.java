package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc(String title, String category, String director, int length, float cost){
		super(title, category, director, length, cost);
	}

	public String getArtist() {
		return artist;
	}
	
	public void addTrack(Track track) {
		if (tracks.contains(track)) {
			return;
		}else {
			tracks.add(track);
		}
	}
	
	public void removeTrack(Track track) {
		if (tracks.contains(track)) {
			tracks.remove(track);
		}else {
			System.out.println("Not contain that track!!!");
		}
	}
	
	public int getLength() {
		int totalLength = 0;
		for (Track tr: tracks) {
			totalLength += tr.getLength();
		}
		return totalLength;
	}
	
	public void play() {
		for (Track tr: tracks) {
			tr.play();
		}
	}

}
