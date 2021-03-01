package dk.logb.javase.constructors.ex06;

/**
 * Illustrerer at man kan overloade constructors.
 */

public class OverloadingConstructors
{
  public static void main(final String[] args)
  {

    Person person1 = new Person();
    System.out.println("1. persons fornavn = " + person1.fornavn);

    Person person2 = new Person("Rasmus");
    System.out.println("2. persons fornavn = " + person2.fornavn);
  }
}

class Person
{
  String fornavn;

  Person()
  {
    fornavn = "ukendt";
  }

  Person(final String fn)
  {
    fornavn = fn;
  }
}
