package CodeCoolWeek9A_LetStartJava_Movies;
import java.util.ArrayList;

public class Movie {

	String title;
	Genre genre;
	long duration;
	double rate;
	ArrayList<Person> cast = new ArrayList<Person>();
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public long getDuration() {
		return duration;
	}
	public void setDuration(long duration) {
		this.duration = duration;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public ArrayList<Person> getCast() {
		return cast;
	}
	public void setCast(ArrayList<Person> cast) {	
		this.cast = cast;
	}
	public String toXMLString() {
		return "<movie>" +
				Tools.toXMLTag("title", this.title) +
				Tools.toXMLTag("genre", String.valueOf(this.genre)) +
				Tools.toXMLTag("duration", String.valueOf(this.duration)) + 
				Tools.toXMLTag("rate", String.valueOf(this.rate)) +
				
				for (Person person : this.cast) {
					Tools.toXMLTag("person", person.toXMLString())
				} +
				
				"</movie>";
	}
}
