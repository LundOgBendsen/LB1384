package lab03.oop3.define.classes;

// Denne klasse modellerer en person som et objekt, der har et fornavn, et
// efternavn og et fødeår.
public class Person {

	// fornavn sættes som udgangspunkt til 'unknown'
	public String firstName = "Unknown";

	// efternavn sættes som udgangspunkt til 'unknown'
	public String lastName = "Unknown";

	// fødeår sættes som udgangspunkt til -1
	public int birthYear = -1;
	
	public static int totalNumberOfPersons; 				//(c)
}
