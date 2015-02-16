package ie.cit.caf.lctutorial;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty; 

@JsonIgnoreProperties(ignoreUnknown = true)

public class Artwork {
	
	private String acno;
	@JsonProperty("all_artists")
	private String artist; 
	private int acquisitionYear; 
	
	public String toString() {
		String artworkAsString = "Artist: " + artist 
				+ "\nAcquired: " + acquisitionYear
				+ "\nAcquisition number: " + acno;  
				
		return artworkAsString; 
	}

	public String getAcno() {
		return acno;
	}

	public void setAcno(String acno) {
		this.acno = acno;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getAcquisitionYear() {
		return acquisitionYear;
	}

	public void setAcquisitionYear(int acquisitionYear) {
		this.acquisitionYear = acquisitionYear;
	}

	
}
