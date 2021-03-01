package dk.logb.javase.inheritanceandcomposition.ex05;

/*
 * Viser at metoder nedarves til subklasser.
 */
public class MethodsAreInherited
{
  public static void main(final String[] args)
  {

    Car car = new Car();
    car.maxSpeed = 200;
    car.numberOfWheels = 4;

    System.out.println(car.isUnderMaxSpeed(140));
  }
}

class Vehicle
{
  int maxSpeed;

  // Denne metode nedarves til Car
  boolean isUnderMaxSpeed(final int speed)
  {
    if (speed < maxSpeed)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}

class Car extends Vehicle
{
  int numberOfWheels;
}
