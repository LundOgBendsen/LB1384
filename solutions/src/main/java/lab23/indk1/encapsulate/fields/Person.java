package lab23.indk1.encapsulate.fields;

public class Person
{

  // Sørg for at felterne ikke kan ændres af kode udenfor Person-klassen
  private static int totalNumberOfPersons;

  // Sørg for at felterne ikke kan ændres af kode udenfor Person-klassen
  private String firstName = "Unknown";

  // Sørg for at felterne ikke kan ændres af kode udenfor Person-klassen
  private String lastName = "Unknown";

  // Sørg for at felterne ikke kan ændres af kode udenfor Person-klassen
  private int birthYear = -1;

  // Sørg for validering af firstName og lastName
  public void setFullName(final String firstName, final String lastName)
  {
    this.setFirstName(firstName);
    this.setLastName(lastName);
  }

  // Sørg for validering af firstName og lastName
  // ved at kalde videre på set-metoder der validerer.
  public Person(final String firstName, final String lastName, final int birthYear)
  {
    this.setFirstName(firstName);
    this.setLastName(lastName);
    this.setBirthYear(birthYear);
  }

  public Person(final String firstName, final String lastName)
  {
    this(firstName, lastName, getCurrentYear());
  }

  public int getBirthYear()
  {
    return birthYear;
  }

  // Sørg for validering af firstNam
  public void setBirthYear(final int birthYear)
  {
    this.birthYear = birthYear;
  }

  public String getFirstName()
  {
    return firstName;
  }

  // Sørg for validering af firstName
  public void setFirstName(final String firstName)
  {
    if (firstName == null)
    {
      String msg = "Parameter firstName must not be null";
      throw new NullPointerException(msg);
    }
    if (firstName.equals(""))
    {
      String msg = "Parameter firstName must not be null";
      throw new IllegalArgumentException(msg);
    }
    this.firstName = firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  // Sørg for validering af lastName
  public void setLastName(final String lastName)
  {
    if (lastName == null)
    {
      String msg = "Parameter lastName must not be null";
      throw new NullPointerException(msg);
    }
    if (lastName.equals(""))
    {
      String msg = "Parameter lastName must not be null";
      throw new IllegalArgumentException(msg);
    }
    this.lastName = lastName;
  }

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

  public static int getTotalNumberOfPersons()
  {
    return Person.totalNumberOfPersons;
  }

}
