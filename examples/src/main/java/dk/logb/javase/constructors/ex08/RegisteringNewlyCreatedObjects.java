package dk.logb.javase.constructors.ex08;

/**
 * Illustrerer brugen af keyword'et this, som en reference til
 * det objekt constructoren er ved at lave. Her med det form�l at
 * fort�lle noget andet kode, at objektet netop er ved at blive
 * lavet. I dette tilf�lde har klassen Person selv en Liste
 * hvori den husker alle de objekter den har lavet...
 *
 * Bem�rk at folk der laver person-objekter IKKE P� NOGEN
 * M�DE kan undg� at det objekt de laver puttes ind i ArrayListen!
 */
import java.util.ArrayList;

public class RegisteringNewlyCreatedObjects
{
  public static void main(final String[] args)
  {
    Person person1 = new Person("Vicky");
    Person person2 = new Person("Rasmus");
    Person person3 = new Person("Jeppe");
    System.out.println("Listens indhold efter at have lavet 3 objekter:");
    for (int i = 0; i < Person.allPersonObjects.size(); i++)
    {
      System.out.println(Person.allPersonObjects.get(i));
    }
    new Person("Bodil");
    new Person("Kjeld");

    System.out.println("Listens indhold efter at have lavet endnu 2 objekter:");
    for (int i = 0; i < Person.allPersonObjects.size(); i++)
    {
      System.out.println(Person.allPersonObjects.get(i));
    }
  }
}

class Person
{
  static ArrayList<Person> allPersonObjects = new ArrayList<Person>();

  String fornavn;

  Person(final String fornavn)
  {
    this.fornavn = fornavn;
    allPersonObjects.add(this);
  }

  @Override
  public String toString()
  {
    return "Person[fornavn=" + fornavn + "]";
  }
}
