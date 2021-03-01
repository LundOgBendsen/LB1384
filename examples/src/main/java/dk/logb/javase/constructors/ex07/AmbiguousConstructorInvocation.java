package dk.logb.javase.constructors.ex07;

/**
 * Illustrerer Java-kompileren entydigt skal kunne afg�re
 * hvilken constructor af flere mulige man �nsker at bruge.
 * 
 * Det kan ikke entydigt afg�res her, hvorfor programmet
 * ikke vil kompilere.
 */

public class AmbiguousConstructorInvocation
{
  public static void main(final String[] args)
  {
    // Bruger entydigt constructor 1
    TvetydigKlasse sk1 = new TvetydigKlasse(12, 3.3);

    // Bruger entydigt constructor 2
    TvetydigKlasse sk2 = new TvetydigKlasse(12.4, 3);

    // Bruger ikke entydigt een af de to. Begge parametre
    // kan g� som v�rende heltal, og de kan ogs� begge v�re
    // doubles!
//    TvetydigKlasse sk3 = new TvetydigKlasse(4, 3);
  }
}

class TvetydigKlasse
{
  // Constructor 1
  TvetydigKlasse(final int i, final double d)
  {
    System.out.println("f�rst int("+i+"), s� double ("+d+")");
  }

  // Constructor 2
  TvetydigKlasse(final double d, final int i)
  {
    System.out.println("f�rst double("+d+"), s� int("+i+")");
  }
}
