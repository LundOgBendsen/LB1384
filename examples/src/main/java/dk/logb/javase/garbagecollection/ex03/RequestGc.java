package dk.logb.javase.garbagecollection.ex03;

/*
 * Viser hvordan vi kan tvinge garbage collectoren til
 * at k�re vha. System.gc().
 */

class RequestGc
{
  public static void main(final String[] args)
  {
    System.out.println("Tildeler p1 en Person-objekt");
    Person p1 = new Person("Rasmus");
    System.out.println("Tvinger garbage collectoren til at k�re");
    System.gc();
    System.out.println("S�tter p1 til null");
    p1 = null;
    System.out.println("Tvinger garbage collectoren til at k�re");
    System.gc();
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
