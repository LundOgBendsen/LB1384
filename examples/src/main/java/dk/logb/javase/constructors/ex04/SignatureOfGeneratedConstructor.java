package dk.logb.javase.constructors.ex04;

/**
 * Illustrerer at den autogenererede constructor ER en no-args constructor
 * (klassen vil ikke compile, hvis vi som her sender parametre med til
 * constructoren).
 */

public class SignatureOfGeneratedConstructor
{
  public static void main(final String[] args)
  {

    Person person1 = new Person();
    // i linien nedenfor går det galt under compile...
//    Person person2 = new Person("Rasmus");
  }
}

class Person
{
}
