package lab23.indk1.encapsulate.fields;

public class Person
{

  // S�rg for at felterne ikke kan �ndres af kode udenfor Person-klassen
  private static int totalNumberOfPersons;

  // S�rg for at felterne ikke kan �ndres af kode udenfor Person-klassen
  private String firstName = "Unknown";

  // S�rg for at felterne ikke kan �ndres af kode udenfor Person-klassen
  private String lastName = "Unknown";

  // S�rg for at felterne ikke kan �ndres af kode udenfor Person-klassen
  private int birthYear = -1;

  // S�rg for validering af firstName og lastName
  public void setFullName(final String firstName, final String lastName)
  {
    this.setFirstName(firstName);
    this.setLastName(lastName);
  }

  // S�rg for validering af firstName og lastName
  // ved at kalde videre p� set-metoder der validerer.
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

  // S�rg for validering af firstNam
  public void setBirthYear(final int birthYear)
  {
    this.birthYear = birthYear;
  }

  public String getFirstName()
  {
    return firstName;
  }

  // S�rg for validering af firstName
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

  // S�rg for validering af lastName
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
