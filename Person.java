package CodeCoolWeek9A_LetStartJava_Movies;

public class Person {
	
	String firstName;
	String lastName;
	Gender gender;
	boolean hasOscar;
	boolean hasGoldenGlobe;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public boolean isHasOscar() {
		return hasOscar;
	}
	public void setHasOscar(boolean hasOscar) {
		this.hasOscar = hasOscar;
	}
	public boolean isHasGoldenGlobe() {
		return hasGoldenGlobe;
	}
	public void setHasGoldenGlobe(boolean hasGoldenGlobe) {
		this.hasGoldenGlobe = hasGoldenGlobe;
	}
	public String toXMLString() {
		return Tools.toXMLTag("person", Tools.toXMLTag("firstName", this.firstName) +
										 Tools.toXMLTag("lastName", this.lastName) +
										 Tools.toXMLTag("gender", String.valueOf(this.gender)) +
										 Tools.toXMLTag("hasOscar", String.valueOf(this.hasOscar)) +
										 Tools.toXMLTag("hasGoldenGlobe", String.valueOf(this.hasGoldenGlobe)) );
	}	
	
}
