package dk.logb.javase.exceptions.ex02;

/*
 * Viser en Error - nemlig OutOfMemoryError
 */
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

public class ProvokeMemoryErrorV1
{
  public static void main(final String[] args)
  {
    Collection<Date> c = new LinkedList<Date>();
    while (true)
    {
      c.add(new Date());
    }
  }
}
/*
 * Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
 */
