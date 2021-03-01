package dk.logb.javase.garbagecollection.ex04;

/*
 * Viser hvordan vi vha. constructoren og finalize-metode kan
 * holde �je med, hvor mange objekter af typen Person, der p�
 * et givent tidspunkt eksisterer i hukommelsen.
 * 
 * (Bem�rk at Person-klassen i dette eksempel AFVIGER fra
 * Person-klassen i de andre eksempler).
 * 
 * Ideen kan fx bruges til at teste st�rre programmer med.
 */

class UsingFinalizeToCountInstances
{
  public static void main(final String[] args)
  {
    Person p;
    while (true)
    {
      p = new Person("Rasmus");
      System.out.println(p + " has been created");
    }
  }
}

class Person
{
  int id;

  String name;

  static int nextId = 0;

  // NYT NYT
  static int antalIHukommelsen = 0;

  Person(final String name)
  {
    this.id = ++nextId;
    this.name = name;
    // NYT NYT
    antalIHukommelsen++;
    System.out.println("Der er nu " + Person.antalIHukommelsen + " Person-objekter i hukommelsen");
  }

  @Override
  public String toString()
  {
    return "Person[ id=" + id + ", name= " + name + "]";
  }

  @Override
  public void finalize()
  {
    System.out.println(this + " has been gc'ed");
    // NYT NYT
    antalIHukommelsen--;
    System.out.println("Der er nu " + Person.antalIHukommelsen + " Person-objekter i hukommelsen");
  }
}
