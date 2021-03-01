package dk.logb.javase.proceduralelements.ex01;

/*
 * Autoboxing betyder, at Java *automatisk* kan konvertere en primitiv type
 * (fx int) til dens tilsvarende wrappertype (fx Integer), hvis man fors�ger at
 * bruge en primitiv type p� et sted, hvor kun en reference-type er lovlig.
 * 
 * Auto-unboxing betyder, at Java *automatisk* kan konvertere en wrappertype
 * (fx en Integer) til dens tilsvarende primitive type (fx int), hvis man
 * fors�ger at bruge en referencetype p� et sted, hvor kun en primitiv type
 * er lovlig.
 */
public class AutoBoxing
{
  @SuppressWarnings("unused")
  // en annotation (forklaring f�lger), som angiver
  // at advarsler om at variable, der ikke bruges,
  // ikke skal vises.
  public static void main(final String[] args)
  {

    int int01 = 12;
    Integer integer01 = int01; // auto-boxing - fremfor new Integer(int01)

    Integer integer02 = new Integer(5);
    int int02 = integer02; // auto-unboxing - fremfor integer02.intValue()

    int int03 = integer01 + integer02; // auto-unboxing
    Integer integer03 = integer01 + integer02; // auto-boxing og unboxing

    Integer[] integers = new Integer[3];
    integers[0] = 2; // auto-boxing
    integers[1] = 4; // auto-boxing
    integers[2] = 3; // auto-boxing

    integers[1]++; // auto-unboxing og boxing

    for (int current : integers)
    {
      current += 1;
      System.out.println(current);
    }

    Integer i1 = new Integer(1);
    Integer i2 = new Integer(1);
    int int1 = 1;
    int int2 = 1;
    System.out.println(i1 == i2);
    System.out.println(int1 == int2);
    System.out.println(i1 == int1);
  }
}
