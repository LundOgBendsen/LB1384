package dk.logb.javase.inheritanceandcomposition.ex04;

/*
 * Viser at felter nedarves til subklasser.
 */
public class FieldsAreInherited
{
  public static void main(final String[] args)
  {

    Car car = new Car();
    car.maxSpeed = 200;
    car.numberOfWheels = 4;

    Plane plane = new Plane();
    plane.maxAltitude = 20000;
  }
}

// Vehicle betyder fart�j
class Vehicle
{
  int maxSpeed;
}

class Car extends Vehicle
{
  int numberOfWheels;
}

class Plane extends Vehicle
{
  // Flyve-h�jde
  int maxAltitude;
}
