package dk.logb.javase.constructors.ex09;

/**
 * Dette eksempel viser, at keyword'et "this" ogs� kan bruges til at kalde en
 * anden constructor med - her er det gjort for at for at skrive s� lidt
 * gentagende kode som muligt
 */

public class ConstructorChaining
{
  public static void main(final String[] args)
  {
    Person person1 = new Person("Rasmus", "Lund");
    System.out.println("1. persons fornavn er  = " + person1.fornavn);
    System.out.println("1. persons efternavn er  = " + person1.efternavn);

    Person person2 = new Person("Vicky");
    System.out.println("2. persons fornavn = " + person2.fornavn);
    System.out.println("2. persons efternavn er  = " + person2.efternavn);

    Person person3 = new Person();
    System.out.println("3. persons fornavn = " + person3.fornavn);
    System.out.println("3. persons efternavn er  = " + person3.efternavn);
  }
}

class Person
{
  String fornavn;

  String efternavn;

  Person(final String fornavn, final String efternavn)
  {
    this.fornavn = fornavn;
    this.efternavn = efternavn;
  }

  Person(final String fornavn)
  {
    this(fornavn, "Ukendt");
  }

  Person()
  {
    this("Ukendt", "Ukendt");
  }
}
