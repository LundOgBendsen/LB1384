package lab05.cons1.define.constructors;

public class Person
{

  public String firstName = "Unknown";

  public String lastName = "Unknown";

  public int birthYear = -1;

  public static int totalNumberOfPersons;

  @Override
  public String toString()
  {
    String result = "Person[firstName: " + firstName;
    result += ", lastName: " + lastName;
    result += ", birthYear: " + birthYear + "]";
    return result;
  }

  public int getAgeAt(final int atYear)
  {
    int result = atYear - birthYear;
    if (result < 0)
    {
      result = 0;
    }
    return result;
  }

  public int getCurrentAge()
  {
    int currentYear = getCurrentYear();
    return getAgeAt(currentYear);
  }

  private static int getCurrentYear()
  {
    java.util.Calendar c = java.util.Calendar.getInstance();
    int currentYear = c.get(java.util.Calendar.YEAR);
    return currentYear;
  }

  public void setFullName(final String firstName, final String lastName)
  {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Person(final String firstName, final String lastName, final int birthYear)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthYear = birthYear;
    Person.totalNumberOfPersons++;
  }

  public Person(final String firstName, final String lastName)
  {
    this(firstName, lastName, getCurrentYear());
  }

  public static int getTotalNumberOfPersons()
  {
    return Person.totalNumberOfPersons;
  }
}
