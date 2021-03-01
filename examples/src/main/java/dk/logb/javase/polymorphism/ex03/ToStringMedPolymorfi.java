package dk.logb.javase.polymorphism.ex03;

/*
 * Illustrerer hvor nemt det er at skrive objekter ud,
 * hvis vi bruger polymorfi, og String-metoden m� bruges
 */
import java.util.Vector;

@SuppressWarnings("all")
public class ToStringMedPolymorfi
{
  public static void main(final String[] args)
  {
    Vector v = new Vector();
    v.add(new Car(200));
    v.add(new Truck(120));
    v.add(new Ship(3, 30));

    // Nemt at udskrive disse med polymorfi
    System.out.println("Vector skriver selv ud: ");
    System.out.println(v);

    // Eller hvis vi g�r det manuelt
    System.out.println("\nManuel udskrivning af vector'en: ");
    for (int n = 0; n < v.size(); n++)
    {
      System.out.println(v.get(n).toString());
    }
  }
}

abstract class Vehicle
{
  int speed;

  Vehicle(final int speed)
  {
    this.speed = speed;
  }
}

class Car extends Vehicle
{
  int numberOfWheels = 4;

  Car(final int speed)
  {
    super(speed);
  }

  @Override
  public String toString()
  {
    return "Car[speed=" + speed + ", numberOfWheels=" + numberOfWheels + "]";
  }
}

class Truck extends Car
{
  Truck(final int speed)
  {
    super(speed);
    numberOfWheels = 12;
  }

  @Override
  public String toString()
  {
    return "Truck[speed=" + speed + ", numberOfWheels=" + numberOfWheels + "]";
  }
}

class Ship extends Vehicle
{
  int numberOfSails;

  Ship(final int numberOfSails, final int speed)
  {
    super(speed);
    this.numberOfSails = numberOfSails;
  }

  @Override
  public String toString()
  {
    return "Ship[speed=" + speed + ", numberOfSails=" + numberOfSails + "]";
  }
}
