package lab04.oop4.define.methods;

public class Person
{

  public String firstName = "Unknown";

  public String lastName = "Unknown";

  public int birthYear = -1;

  public static int totalNumberOfPersons;

  // (a) toString-metode der laver String på formen:
  // Person[firstName: Rasmus, lastName: Lund, birthYear: 1973]
  @Override
  public String toString()
  {
    String result = "Person[firstName: " + firstName;
    result += ", lastName: " + lastName;
    result += ", birthYear: " + birthYear + "]";
    return result;
  }

  // (b)
  public int getAgeAt(final int atYear)
  {
    int result = atYear - birthYear;
    if (result < 0)
    {
      result = 0;
    }
    return result;
  }

  // (c)
  public int getCurrentAge()
  {
    java.util.Calendar c = java.util.Calendar.getInstance();
    int currentYear = c.get(java.util.Calendar.YEAR);
    return getAgeAt(currentYear);
  }

  // (d)
  public void setFullName(final String firstName, final String lastName)
  {
    this.firstName = firstName;
    this.lastName = lastName;
  }

}
