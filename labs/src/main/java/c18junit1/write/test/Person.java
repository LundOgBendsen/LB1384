package c18junit1.write.test;

import java.time.LocalDate;

public class Person {

	public String firstName = "Unknown";

	public String lastName = "Unknown";

	public final LocalDate birthDay;

	public Person(LocalDate birthDay) {
		super();
		this.birthDay = birthDay;
	}
	
	public long getAgeAt(LocalDate date) {
		return date.getYear() - birthDay.getYear();
	}
	
	public void setFullName(final String firstName, final String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
