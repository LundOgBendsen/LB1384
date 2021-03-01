package dk.logb.javase.arrays.ex01;

import java.util.ArrayList;

/*
 * Eksemplet viser basal brug af en typest�rk ArrayList.
 */
public class ArrayListExample
{
  public static void main(final String[] args)
  {
    ArrayList<String> v = new ArrayList<String>();

    v.add("hej");
    v.add("med");
    v.add("dig!");

    String first = v.get(0);
    String second = v.get(1);
    String third = v.get(2);

    for (String s : v)
    {
      System.out.println(s);
    }

  }
}
