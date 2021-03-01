package dk.logb.javase.constructors.ex03;

/**
 * Illustrerer at Java automatisk laver en constructor, hvis man ikke selv har
 * lavet en. Den tager ingen parametre. Kaldes no-arg eller default constructor
 */

public class JavaGeneratesConstructor
{
  public static void main(final String[] args)
  {

    Person person1 = new Person();
    Person person2 = new Person();
  }
}

class Person
{
}
