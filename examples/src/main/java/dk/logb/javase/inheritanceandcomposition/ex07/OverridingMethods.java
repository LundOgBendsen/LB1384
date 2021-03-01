package dk.logb.javase.inheritanceandcomposition.ex07;

/*
 * Viser at man kan override (tilsides�tte) implementationen
 * af en metode. Man kan ogs� tilf�je metoder.
 */
public class OverridingMethods
{
  public static void main(final String[] args)
  {
    InferiorClass mc = new InferiorClass();
    mc.printA(); // den nedarvede
    mc.printB(); // den overridede
    mc.printC(); // den overridede der kalder super
  }
}

class SuperiorClass
{
  void printA()
  {
    System.out.println("K�rte SuperiorClass' printA-metode");
  }

  void printB()
  {
    System.out.println("K�rte SuperiorClass' printB-metode");
  }

  void printC()
  {
    System.out.println("K�rte SuperiorClass' printC-metode");
  }
}

class InferiorClass extends SuperiorClass
{
  // Vi g�r intet ved den nedarvede metode A

  // Vi overrider implementationen af den nedarvede metode B
  @Override
  void printB()
  {
    System.out.println("K�rte InferiorClass' printB-metode");
  }

  // Vi overrider implementationen af den nedarvede metode C
  @Override
  void printC()
  {
    // Vi k�rer f�rst superklassens printC
    super.printC();
    // S� k�rer vi noget vi tilf�jer
    System.out.println("K�rte InferiorClass' printC-metode");
  }

}
