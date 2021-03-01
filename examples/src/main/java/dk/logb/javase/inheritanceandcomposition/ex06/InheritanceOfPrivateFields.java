package dk.logb.javase.inheritanceandcomposition.ex06;

/*
 * Viser at private felter nedarves, men ikke er synlige
 * for subklasser.
 */
public class InheritanceOfPrivateFields
{
  public static void main(final String[] args)
  {

    Car car = new Car();

    // IKKE LOVLIGT da maxSpeed er private og nedarvet
    // giver compile-fejl hvis det udkommenteres
//     car.maxSpeed = 200;

    // LOVLIGT
    car.setMaxSpeed(200);
    System.out.println(car.getMaxSpeed());
    // dvs. feltet maxSpeed er nedarvet - vi kan bare ikke se det
    // eller tilg� det direkte fra sub-klassen da feltet er private.
  }
}

class Vehicle
{
  // Private members nedarves men er ikke synlig i subklassen Car
  private int maxSpeed;

  // Public members nedarves og er synlige i subklassen Car
  public int getMaxSpeed()
  {
    return maxSpeed;
  }

  public void setMaxSpeed(final int maxSpeed)
  {
    this.maxSpeed = maxSpeed;
  }
}

class Car extends Vehicle
{
  int numberOfWheels;
}
