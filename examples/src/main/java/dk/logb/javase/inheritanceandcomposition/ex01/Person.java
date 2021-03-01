package dk.logb.javase.inheritanceandcomposition.ex01;

public class Person
{
  private final int birthYear;

  // Her er genbrug i form af komposition
  // Passer godt idet man kan sige at Person HAS A PersonName
  private PersonName name;

  public Person(final PersonName name, final int birthYear)
  {
    this.birthYear = birthYear;
    this.setName(name);
  }

  public Person(final String firstName, final String lastName, final int birthYear)
  {
    this(new PersonName(firstName, lastName), birthYear);
  }

  // Bem�rk birthYear ikke kan �ndres n�r f�rst det er sat
  // til et �rstal vha. constructoren.
  public int getBirthYear()
  {
    return birthYear;
  }

  public PersonName getName()
  {
    return name;
  }

  public void setName(final PersonName name)
  {
    this.name = name;
  }

  @Override
  public String toString()
  {
    return "Person[name=" + name + ",birthYear=" + birthYear + "]";
  }
}
