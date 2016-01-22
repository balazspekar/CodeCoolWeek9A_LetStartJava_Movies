package CodeCoolWeek9A_LetStartJava_Movies;
import java.util.ArrayList;
import java.util.List;

public class Movie {

	String title;
	Genre genre;
	long duration;
	double rate;
	List<Person> cast = new ArrayList<Person>();
	
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
	public List<Person> getCast() {
		return cast;
	}
	public void setCast(ArrayList<Person> cast) {	
		this.cast = cast;
	}
	public String toXMLString() {
		return "";
	}
	
	
}
