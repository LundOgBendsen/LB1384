package dk.logb.javase.c12exceptions.ex03;

/*
 * Viser en RuntimeException - nemlig IndexOutOfBoundsException,
 * der h�ndteres. Viser ogs� at det her virker t�beligt...
 * Faktisk er det et eksempel p� rigtig d�rlig brug af
 * Exceptions - nemlig til at opn� almindeligt flow med -
 * dvs. vi helt bevidst forventer at f� en fejl hver gang....!
 */

public class AccessIllegalIndexV2
{
  public static void main(final String[] args)
  {
    String[] s = new String[3];
    s[0] = "Hej";
    s[1] = " med";
    s[2] = " dig!\n";
    try
    {
      int n = 0;
      while (true)
      {
        System.out.print(s[n]);
        n++;
      }
    }
    catch (IndexOutOfBoundsException e)
    {
      System.out.println("Vi forhindrede programmet i at g� ned, " + "selvom vi tilgik et ulovligt index i arrayet");
    }
  }
}
