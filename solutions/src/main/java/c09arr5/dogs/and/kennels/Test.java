package c09arr5.dogs.and.kennels;

public class Test
{

  public static void main(final String[] args)
  {
    Dog bibbi = new Dog("Bibbi");
    Dog tjek = new Dog("Tjek");
    Dog trine = new Dog("Trine");
    Dog vax = new Dog("Vax");

    Dog bølle = new Dog("Bølle", tjek, trine);
    Dog rollo = new Dog("Rollo", vax, bibbi);

    Dog buller = new Dog("Buller", bølle, bibbi);
    Dog krølle = new Dog("Krølle", rollo, trine);

    System.out.println(bibbi.deepToString());
    System.out.println(tjek.deepToString());
    System.out.println(trine.deepToString());
    System.out.println(vax.deepToString());
    System.out.println(bølle.deepToString());
    System.out.println(rollo.deepToString());
    System.out.println(buller.deepToString());
    System.out.println(krølle.deepToString());
  }
}
