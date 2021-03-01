package dk.logb.javase.garbagecollection.ex01;

/*
 * Viser at et objekt ikke n�dvendigvis garbage collectes med
 * det samme - og evt. slet ikke i l�bet af programmets levetid.
 */

class JvmDecidesWhenToGc
{
  public static void main(final String[] args)
  {
    System.out.println("Tildeler p1 en Person-objekt");
    Person p1 = new Person("Rasmus");
    System.out.println("S�tter p1 til null");
    p1 = null;
    System.out.println("Venter 3 sekunder");
    try
    {
      Thread.sleep(3000);
    }
    catch (InterruptedException e)
    {
    }
    System.out.println("Afslutter programmet");
  }
}

class Person
{
  int id;

  String name;

  static int nextId = 0;

  Person(final String name)
  {
    this.id = ++nextId;
    this.name = name;
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
  }
}
