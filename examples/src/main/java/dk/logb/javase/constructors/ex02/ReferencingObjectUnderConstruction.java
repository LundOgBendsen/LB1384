package dk.logb.javase.constructors.ex02;

/**
 * Illustrerer brugen af keyword'et this, som en reference til det objekt
 * constructoren er ved at lave. Her med det form�l at kunne f� fat i de felter,
 * der overskygges af lokale variable med samme identifier (navn). Konkret g�res
 * det vha. this.feltNavn;
 */

public class ReferencingObjectUnderConstruction
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

  Person(final String fornavn)
  {
    // bem�rk at metoden tager en parameter, der hedder det
    // samme som instansvariablen 'fornavn'. Dermed overskygger
    // parametren instansvariablen. Vi kan f� fat i instansvariablen
    // ved at skrive "this" foran variabelnavnet, idet "this" er et
    // handle til det objekt, som constructoren er ved at lave.
    this.fornavn = fornavn;
    // (Bem�rk at "this" ogs� kan bruges i metoder, s� er det et
    // handle til det objekt, som metoden blev kaldt p�).
  }
}
