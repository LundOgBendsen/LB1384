package c02oop3.define.classes;

/**
 * Models a Person as an object with first name, last name and birth year 
 */
public class Person {

	/* firstName is initialized to Unknown as default */
	public String firstName = "Unknown";

	/* lastName is initialized to Unknown as default */
	public String lastName = "Unknown";

	/* birthYear is initialized to -1 as default */
	public int birthYear = -1;
	
	public static int totalNumberOfPersons; 				//(c)
}
