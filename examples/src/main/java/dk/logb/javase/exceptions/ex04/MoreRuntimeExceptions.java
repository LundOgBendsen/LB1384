package dk.logb.javase.exceptions.ex04;

/*
 * Viser tre RuntimeExceptions - nemlig:
 * NullPointerException, ArithmeticException og ClassCastException
 */

public class MoreRuntimeExceptions
{
  // initialiseres automatisk til null
  static String s;

  public static void main(final String[] args)
  {
    // Ex med NullPointerException
    try
    {
      System.out.println("Pr�ver s.trim() hvor s == null");
      s.trim();
    }
    catch (NullPointerException e)
    {
      System.out.println("\n\tGreb f�lgende fejl: " + e);
    }
    // Ex med ArithmeticException
    try
    {
      System.out.println("\n\n\nPr�ver 12 / 0");
      int n = 12 / 0;
    }
    catch (ArithmeticException e)
    {
      System.out.println("\n\tGreb f�lgende fejl: " + e);
    }
    // Ex med ClassCastException (se klasserne nedenfor)
    try
    {
      System.out.println("\n\n\nPr�ver: ");
      System.out.println("Role r = new Role();");
      System.out.println("StudentRole sr = (StudentRole)r;");
      Role r = new Role();
      StudentRole sr = (StudentRole) r;
    }
    catch (ClassCastException e)
    {
      System.out.println("\n\tGreb f�lgende fejl: " + e);
      e.printStackTrace();
    }
  }
}

class Role
{
}

class StudentRole extends Role
{
}
