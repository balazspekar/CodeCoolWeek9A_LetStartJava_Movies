package CodeCoolWeek9A_LetStartJava_Movies;

import java.util.ArrayList;

public class MovieManager {
	public static void main(String[] args) {
		
		// instantiating persons
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Person person4 = new Person();
		Person person5 = new Person();
		
		// instantiating movies
		Movie movie1 = new Movie();
		Movie movie2 = new Movie();
		Movie movie3 = new Movie();
		Movie movie4 = new Movie();
		Movie movie5 = new Movie();
		
		// filling up Person type objects with data
		person1.setFirstName("Arnold");
		person1.setLastName("Schwarzenegger");
		person1.setGender(Gender.MALE);
		person1.setHasGoldenGlobe(true);
		person1.setHasOscar(true);

		person2.setFirstName("Bob");
		person2.setLastName("Odenkirk");
		person2.setGender(Gender.MALE);
		person2.setHasGoldenGlobe(false);
		person2.setHasOscar(false);
		
		person3.setFirstName("Francois");
		person3.setLastName("Cluzet");
		person3.setGender(Gender.MALE);
		person3.setHasGoldenGlobe(false);
		person3.setHasOscar(true);
		
		person4.setFirstName("Kiefer");
		person4.setLastName("Sutherland");
		person4.setGender(Gender.MALE);
		person4.setHasGoldenGlobe(true);
		person4.setHasOscar(true);
		
		person5.setFirstName("Elisha");
		person5.setLastName("Cuthbert");
		person5.setGender(Gender.FEMALE);
		person5.setHasGoldenGlobe(false);
		person5.setHasOscar(false);
		
		// filling up Movies type objects with data
		movie1.setTitle("The Intouchables");
		movie1.setGenre(Genre.COMEDY);
		movie1.setDuration(112);
		movie1.setRate(8.6);
		ArrayList<Person> persons1 = new ArrayList<Person>();
		persons1.add(person1);
		persons1.add(person2);
		persons1.add(person3);
		movie1.setCast(persons1);
		
		movie2.setTitle("Commando");
		movie2.setGenre(Genre.ACTION);
		movie2.setDuration(134);
		movie2.setRate(4.4);
		ArrayList<Person> persons2 = new ArrayList<Person>();
		persons2.add(person4);
		persons2.add(person1);
		persons2.add(person2);
		movie2.setCast(persons2);
		
		movie3.setTitle("Terminator");
		movie3.setGenre(Genre.ACTION);
		movie3.setDuration(154);
		movie3.setRate(9.1);
		ArrayList<Person> persons3 = new ArrayList<Person>();
		persons3.add(person5);
		persons3.add(person4);
		persons3.add(person3);
		movie3.setCast(persons3);
		
		movie4.setTitle("Terminator");
		movie4.setGenre(Genre.ACTION);
		movie4.setDuration(154);
		movie4.setRate(9.1);
		ArrayList<Person> persons4 = new ArrayList<Person>();
		persons4.add(person4);
		persons4.add(person3);
		persons4.add(person2);
		movie4.setCast(persons4);
		
		movie5.setTitle("Star Wars");
		movie5.setGenre(Genre.SCI_FI);
		movie5.setDuration(135);
		movie5.setRate(9.5);
		ArrayList<Person> persons5 = new ArrayList<Person>();
		persons4.add(person5);
		persons4.add(person5);
		persons4.add(person5);
		movie5.setCast(persons5);
		
		// generating XML like string for Person
		System.out.println(person1.toXMLString());
		
		// generating XML like string for Movie
		System.out.println(movie1.toXMLString());
		
	}

	
}
