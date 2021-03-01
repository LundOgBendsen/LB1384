package dk.logb.javase.exceptions.ex01;

/*
 * Illustrerer grundprincippet i Javas fejlh�ndtering
 */
public class SimpleTryCatch
{
  public static void main(final String[] args)
  {

    try
    {

      // Noget der kan resulterer i en exception/fejl skrives i en
      // 'try'-blok.

      // For eksemplets skyld dividerer vi her med 0, hvilket altid g�r
      // galt.

      int i = 23 / 0; // Her LAVER og KASTER Java et AritmeticException-objekt

      System.out.println(i);
    }
    catch (ArithmeticException e)
    {

      // En 'try'-blok efterf�lges altid umiddelbart af �n eller flere
      // catch-blokke.

      // Denne catch-blok GRIBER alle AritmeticException-objekter, der er
      // blevet
      // LAVET og KASTET i 'try'-blokken umiddelbart f�r.

      System.out.println("Har grebet en exception: " + e);

    }

  }
}
