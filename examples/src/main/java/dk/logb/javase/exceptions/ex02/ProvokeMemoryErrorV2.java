package dk.logb.javase.exceptions.ex02;

/*
 * Viser en Error - nemlig OutOfMemoryError, og at de i absurde situationer
 * kan h�ndteres - det er dog sj�ldent tilr�deligt at g�re det.
 */

import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

public class ProvokeMemoryErrorV2
{
  public static void main(final String[] args)
  {
    Collection<Date> c = new LinkedList<Date>();
    System.out.println("Starts to fill the list with Date-objects!");
    while (true)
    {
      try
      {
        c.add(new Date());
      }
      catch (OutOfMemoryError e)
      {
        c.clear();
        System.out.println(e + "\nJust cleared the list!");

        String msg = "\nStarts to fill the list with Date objects again!";
        System.out.println(msg);
      }
    }
  }
}
