package dk.logb.javase.garbagecollection.ex05;

/*
 * Illustrerer brugen af svage referencer, som er referencer,
 * der IKKE forhindrer, at objektet de refererer til bliver
 * garbage collected!
 */
import java.lang.ref.WeakReference;

class UsingWeakReferences
{
  public static void main(final String[] args)
  {
    System.out.println("Tildeler p1 en Person-objekt");
    Person p1 = new Person("Rasmus");
    System.out.println("Laver en weak ref til samme objekt");

    // WeakReference's constructor tager et Object som parameter,
    // hvilket er det objekt den skal lave en weak ref. til.
    WeakReference<Person> weakP1 = new WeakReference<Person>(p1);

    System.out.println("Udskriver det objekt vores weak ref. referer til");

    // WeakReferences har metoden get(), der returnerer det
    // objekt de refererer til (som typen Object). Hvis objektet
    // er blevet gc'et, returneres v�rdien null.
    System.out.println(weakP1.get());

    System.out.println("S�tter p1 til null");
    p1 = null;

    System.out.println("Udskriver det objekt vores weak ref. referer til");
    System.out.println("\t(med lidt held er objektet endnu ikke blevet gc'et)");
    System.out.println(weakP1.get());

    System.out.println("Vi tvinger garbage collectoren til at k�re");
    System.gc();

    System.out.println("Udskriver det objekt vores weak ref. referer til");
    System.out.println("\t(vi b�r f� null, da en weak ref. ikke forhindrer");
    System.out.println("\tat objektet bliver gc'et)");
    System.out.println(weakP1.get());
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
