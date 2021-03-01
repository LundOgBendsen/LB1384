package dk.logb.javase.garbagecollection.ex02;

/*
 * Viser at garbage collectoren s�tter ind, n�r der er
 * brugt en god portion af hukommelsen.
 * 
 * Viser ogs� at objekter ikke n�dvendigvis garbage
 * collectes i den r�kkef�lge, som de blev lavet i.
 */

class FillMemoryToForceGc
{
  public static void main(final String[] args)
  {
    System.out.println("Begynder at lave uendeligt mange objekter");
    while (true)
    {
      System.out.println(new Person("Rasmus") + " has been created");
    }
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
