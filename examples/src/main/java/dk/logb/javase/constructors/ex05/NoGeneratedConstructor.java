package dk.logb.javase.constructors.ex05;

/**
 * Hvis vi laver en constructor selv, laver Java IKKE selv en no-args / default
 * constructor - derfor f�r vi compilefejl i dette eksempel
 */

public class NoGeneratedConstructor
{
  public static void main(final String[] args)
  {
    // linien nedenfor er skyld i at vi ikke kan compile. Java pr�ver at
    // kalde en constructor der ikke tager nogle argumenter - men en
    // s�dan constructor findes ikke...
   // Person person1 = new Person();
//    System.out.println("1. persons fornavn = " + person1.fornavn);

    Person person2 = new Person("Rasmus");
    System.out.println("2. persons fornavn = " + person2.fornavn);
  }
}

class Person
{
  String fornavn;

  // Bem�rk, at der ikke l�ngere er en no-args constructor
  Person(final String fornavn)
  {
    this.fornavn = fornavn;
  }
}
