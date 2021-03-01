package dk.logb.javase.inheritanceandcomposition.ex08;

/*
 * Viser at man ikke kan override en metode, der er erkl�ret final
 */
public class FinalMethods
{
}

class SuperClass
{
  final void print()
  {
    System.out.println("K�rte SuperClass' print-metode");
  }
}

class SubClass extends SuperClass
{
  // Metoden er erkl�ret final og kan derfor ikke overrides.
  // Indkomment�r metoden og bem�rk at det giver compilefejl
//   final void print() {
//	   System.out.println("K�rte SubClass' print-metode");
//   }
}
