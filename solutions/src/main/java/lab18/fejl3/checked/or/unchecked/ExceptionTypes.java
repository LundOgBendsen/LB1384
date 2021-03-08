package lab18.fejl3.checked.or.unchecked;

import java.io.File;
import java.io.IOException;

public class ExceptionTypes
{

  public static void main(final String[] args)
  {

    // Metoden getCanonicalPath kan finde p� at kaste med
    // en IOException, der er en checked exception (fordi
    // den ikke er subtype af hverken RuntimeException eller
    // Error). Og kompileren vil altid tvinge os til at tage
    // stilling til, hvordan checked exceptions skal h�ndteres.
    File file = new File("C:\\tmp\u0000");
    try
    {
      System.out.println(file.getCanonicalPath());
    }
    catch (IOException e)
    {
      System.out.println("Stien findes ikke");
    }
    System.out.flush();

    // Metoden parse kan finde p� at kaste med
    // NumberFormatExceptions, som er en unchecked exception-type,
    // dvs. at vi IKKE beh�ver tage stilling til, hvad der
    // skal ske, hvis fejlen opst�r. Det betyder blot at
    // fejlen vil f� programmet til at g� ned med en
    // udskrift af fejlen der var skyld i det.
    int j = Integer.parseInt("123");
    int k = Integer.parseInt("HEJ");
    System.out.println(j + k);

  }
}
