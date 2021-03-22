package c02oop4.define.methods;

import java.time.LocalDate;

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

	// (b)
	public int getAgeAt(final int atYear) {
		int result = atYear - birthYear;
		if (result < 0) {
			result = 0;
		}
		return result;
	}

	// (c)
	public int getCurrentAge() {
		int currentYear = LocalDate.now().getYear();
		return getAgeAt(currentYear);
	}

	// (d)
	public void setFullName(final String firstName, final String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
