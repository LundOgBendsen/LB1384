package dk.logb.javase.constructors.ex01;

/**
 * Illustrerer at Java automatisk kalder en constructor. Bem�rk at constructoren
 * hedder pr�cist det samme som klassen, den har ingen returtype og den har
 * parenteser hvori der kan st� parametre - pr�cist som for en metode.
 */

public class NewInvokesConstructor
{
  public static void main(final String[] args)
  {

    System.out.println("Foer skabelse af 1. person");
    Person person1 = new Person();
    System.out.println("Efter skabelse af 1. person");

    System.out.println("Foer skabelse af 2. person");
    Person person2 = new Person();
    System.out.println("Efter skabelse af 2. person");
  }
}

class Person
{
  Person()
  {
    System.out.println("<< Tom constructor blev kaldt >>");
  }
}
