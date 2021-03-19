package lab99.str1.string.to.person;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Person {

	public String firstName = "Unknown";

	public String lastName = "Unknown";

	public int birthYear = -1;

	public static int totalNumberOfPersons;

	@Override
	public String toString() {
		String result = "Person[firstName: " + firstName;
		result += ", lastName: " + lastName;
		result += ", birthYear: " + birthYear + "]";
		return result;
	}

	public int getAgeAt(final int atYear) {
		int result = atYear - birthYear;
		if (result < 0) {
			result = 0;
		}
		return result;
	}

	public int getCurrentAge() {
		int currentYear = getCurrentYear();
		return getAgeAt(currentYear);
	}

	private static int getCurrentYear() {
		java.util.Calendar c = java.util.Calendar.getInstance();
		int currentYear = c.get(java.util.Calendar.YEAR);
		return currentYear;
	}

	public void setFullName(final String firstName, final String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Person(final String firstName, final String lastName, final int birthYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		Person.totalNumberOfPersons++;
	}

	public Person(final String firstName, final String lastName) {
		this(firstName, lastName, getCurrentYear());
	}

	public static int getTotalNumberOfPersons() {
		return Person.totalNumberOfPersons;
	}

	public static Person createPersonFromString(final String stringWithPerson) {
		StringTokenizer st = new StringTokenizer(stringWithPerson, ",");
		String firstName = st.nextToken().trim();
		String lastName = st.nextToken().trim();
		int birthYear = Integer.parseInt(st.nextToken().trim());
		return new Person(firstName, lastName, birthYear);
	}

	public static ArrayList<Person> createPersonsFromString(final String stringWithPersons) {
		StringTokenizer st = new StringTokenizer(stringWithPersons, "\n");
		ArrayList<Person> persons = new ArrayList<Person>();
		while (st.hasMoreTokens()) {
			persons.add(createPersonFromString(st.nextToken()));
		}
		return persons;
	}
}
