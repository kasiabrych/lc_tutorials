package ie.cit.caf.lctutorial;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty; 

@JsonIgnoreProperties(ignoreUnknown = true)

public class Artist {
	
	private int birthYear; 
	
	@JsonProperty("fc")
	private String  fullName; 
	
	private String gender; 
	
	private int totalWorks; 
	
	private int id;
	
	private List<Movement> movements;
	
	private Birth birth; 
	
	private String role;
	
	public String toString() {
		String artistAsString = "Name: " + fullName 
				+ "\nBorn: " + birthYear 
				+ "\nGender: " + gender
				+ "\nTotal works: " + totalWorks;  
				
				for (Movement m : getMovements()) {
					artistAsString += "-- " + m.getName() + " (" + m.getEra().getName() + ")";
		}
		return artistAsString; 
	}

	public Birth getBirth() {
		return birth;
	}

	public void setBirth(Birth birth) {
		this.birth = birth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Movement> getMovements() {
		return movements;
	}

	public void setMovements(List<Movement> movements) {
		this.movements = movements;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getTotalWorks() {
		return totalWorks;
	}

	public void setTotalWorks(int totalWorks) {
		this.totalWorks = totalWorks;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getBirthYear() {
		return birthYear; 
	}
	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear; 
	}
	
	public String getFullName() {
		return fullName; 
	}
	
	public void setFullName (String fullName) {
		this.fullName = fullName; 
	}

}
