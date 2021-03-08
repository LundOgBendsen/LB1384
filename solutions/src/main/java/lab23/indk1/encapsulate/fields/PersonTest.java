package lab23.indk1.encapsulate.fields;

public class PersonTest
{

  public static void main(final String[] args)
  {
    System.out.println("main-metode: start");

    Person p01 = new Person("Rasmus", "Lund", 1973);
    System.out.println(p01);

    // Kan ikke lade sig gøre, da lastName er private
    // System.out.println(p01.lastName);

    p01.setFirstName("Ole");
    System.out.println(p01);

    // Bør give fejl ved kørsel
    p01.setFirstName(null);

    System.out.println("main-metode: slut");
  }
}
