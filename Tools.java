package CodeCoolWeek9A_LetStartJava_Movies;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Tools {
	
	public static String toXMLTag(String tagname, String value) {
		return "<" + tagname + ">" + value + "</" + tagname + ">";
	}
	
	public static HashMap<Person, Integer> countMoviesPerPerson(List<Movie> movies) {
		return null;
	}
	
	public static String[] getMovieTitles(ArrayList<Movie> movies) {
		int listLength = movies.size();
		String[] result = new String[listLength];
		
		for (int i = 0; i < listLength; i++) {
			result[i] = movies.get(i).getTitle();
		}
		return result;
	}
	
}
