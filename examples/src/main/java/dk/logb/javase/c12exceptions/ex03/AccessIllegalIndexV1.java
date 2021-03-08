package dk.logb.javase.c12exceptions.ex03;

/*
 * Viser en RuntimeException - nemlig IndexOutOfBoundsException,
 * der ikke h�ndteres
 */

public class AccessIllegalIndexV1
{
  public static void main(final String[] args)
  {
    String[] s = new String[3];
    s[0] = "Hello";
    s[1] = " my";
    s[2] = " friend!\n";
    for (int n = 0; n <= 3; n++)
    {
      System.out.print(s[n]);
    }
  }
}
