package lab25.poly1.using.hierachies;

public class Dog extends Mammal
{

  public void bark()
  {
    System.out.println("Vow!");
  }

  @Override
  public void speak()
  {
    System.out.println("WUF WUF");
  }

}
