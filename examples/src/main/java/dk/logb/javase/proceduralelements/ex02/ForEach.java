package dk.logb.javase.proceduralelements.ex02;

/*
 * Viser hvordan enhanced for-l�kken p� en let m�de kan
 * bruges til at genneml�be et array.
 * 
 * Eksemplet viser endvidere, at det ikke er muligt at �ndre
 * v�rdierne i et array vha denne l�kketype.
 */
public class ForEach
{

  public static void main(final String[] args)
  {
    Integer[] primes = new Integer[] { 1, 2, 3, 5, 7 }; // autoboxing

    for (int i : primes)
    {
      System.out.println(i);
    }

    for (int i : primes)
    {
      i = (int) Math.random() * 5; // dette har ingen effekt, da det er den lokale variable i, der �ndres.
    }

    for (int i : primes)
    {
      System.out.println(i); // udskriver i�ndrede v�rdier
    }
  }
}
