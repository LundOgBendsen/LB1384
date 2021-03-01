package dk.logb.javase.inheritanceandcomposition.ex01;

public class PersonName
{

  private String firstName;

  private String lastName;

  public PersonName(final String firstName, final String lastName)
  {
    this.setFirstName(firstName);
    this.setLastName(lastName);
  }

  public String getFirstName()
  {
    return firstName;
  }

  public void setFirstName(final String firstName)
  {
    this.firstName = firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public void setLastName(final String lastName)
  {
    this.lastName = lastName;
  }

  public String getFullName()
  {
    return this.getFirstName() + " " + this.getLastName();
  }

  @Override
  public String toString()
  {
    return "Name[firstName=" + firstName + ",lastName=" + lastName + "]";
  }
}
