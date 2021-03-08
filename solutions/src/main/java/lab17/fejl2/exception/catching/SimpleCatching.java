package lab17.fejl2.exception.catching;

public class SimpleCatching
{

  public static void main(final String[] args)
  {
    String message = null;
    printInUpperCase(message);
  }

  public static void printInUpperCase(final String stringToPrint)
  {
    String stringInUpperCase = convertToUpperCase(stringToPrint);
    System.out.println(stringInUpperCase);
  }

  public static String convertToUpperCase(final String stringIn)
  {
    // Vigtigt at stringOut erklæres udenfor try-blokken,
    // da den ellers kun er synlig inden i try-blokken!!!
    String stringOut;
    try
    {
      stringOut = stringIn.toUpperCase();
    }
    catch (NullPointerException e)
    {
      stringOut = null;
    }
    return stringOut;
  }
}

/*
 * // Ville være pænere med følgende kode:
 * 
 * public static String convertToUpperCase(String stringIn) {
 * String stringOut;
 * if (stringIn != null)
 * stringOut = stringIn.toUpperCase();
 * } else {
 * stringOut = null;
 * }
 * return stringOut;
 * }
 */
