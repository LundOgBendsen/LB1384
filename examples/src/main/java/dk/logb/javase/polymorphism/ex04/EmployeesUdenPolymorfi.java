package dk.logb.javase.polymorphism.ex04;

/*
 * Viser et eksempel p� noget kode, der
 * bruger switch fremfor polymorfi.
 * 
 * Ulemper: Hvis vi retter i Employee ville
 * gemte objekter ikke l�ngere kunne bruges.
 * Det er sv�rt at overskue hvor der skal
 * �ndres hvis vi vil tilf�je en ny type
 * ansat...
 * Det er besv�rligt at checke om et nyt
 * Employee-objekt laves p� den rigtige m�de.
 * 
 * NB: Jeg havde adskillige fejl i denne - hvoraf
 * nogle var runtime, der derfor var sv�re at opdage
 * (mine switches startede ved 1, skulle starte ved 0)
 * 
 * NBB: H�ndterer ikke fejlagtige Employees i constructoren
 */
import java.util.Vector;

public class EmployeesUdenPolymorfi
{
  public static void main(final String[] args)
  {
    Department d = new Department();
    d.addEmployee(new Employee(Employee.MANAGER));
    d.addEmployee(new Employee(Employee.SALESMAN));
    d.addEmployee(new Employee(Employee.SALESMAN));
    d.addEmployee(new Employee(Employee.SALESMAN));
    d.addEmployee(new Employee(Employee.SALESMAN));
    d.addEmployee(new Employee(Employee.ENGINEER));
    d.addEmployee(new Employee(Employee.ENGINEER));
    d.addEmployee(new Employee(Employee.ENGINEER));
    // F�lgende fejl er sv�r at opdage
    // d.addEmployee( new Employee( 8 ) );

    System.out.println(d);
    System.out.println("Total department salary: " + d.totalPayAmount());
  }
}

class Department
{
  Vector<Employee> employees = new Vector<Employee>();

  void addEmployee(final Employee e)
  {
    employees.add(e);
  }

  void removeEmployee(final Employee e)
  {
    employees.remove(e);
  }

  int totalPayAmount()
  {
    int total = 0;
    for (Employee emp : employees)
    {
      total += emp.payAmount();
    }

    return total;
  }

  @Override
  public String toString()
  {
    String s = "Department[\n";
    for (Employee emp : employees)
    {
      s += "\t" + emp.toString() + ",\n";
    }
    return s + "]";
  }
}

class Employee
{
  static final int ENGINEER = 0;

  static final int SALESMAN = 1;

  static final int MANAGER = 2;

  static int salary = 30000;

  static int commission = 10000;

  static int bonus = 40000;

  int type;

  Employee(final int type)
  {
    this.type = type;
  }

  int payAmount()
  {
    switch (type)
    {
      case 0:
        return salary;
      case 1:
        return salary + commission;
      case 2:
        return salary + bonus;
      default: // should never happen
        return 0;
    }
  }

  @Override
  public String toString()
  {
    switch (type)
    {
      case 0:
        return "Employee[type=ENGINEER]";
      case 1:
        return "Employee[type=SALESMAN]";
      case 2:
        return "Employee[type=MANAGER]";
      default:
        return ""; // Should never happen
    }
  }

}
