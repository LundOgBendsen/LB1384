package lab15.genbr1.inheritance.vs.composition;

import java.util.ArrayList;

public class UsingComposition
{
  public static void main(final String[] args)
  {

    // Lav Jens, der kun er instruktør
    Person2 jens = new Person2();
    jens.name = "Jens";

    InstructorRole i = new InstructorRole();
    i.courses.add("OOP");
    i.courses.add("OOA&D");
    i.courses.add("Java");

    jens.roles.add(i);

    System.out.println(jens);

    // Lav Sif, der kun er konsulent
    Person2 sif = new Person2();
    sif.name = "Sif";

    ConsultantRole c = new ConsultantRole();
    c.levelOfCompetence = 12;

    sif.roles.add(c);

    System.out.println(sif);

    // Lav Bjarke, der både er konsulent og instruktør
    Person2 bjarke = new Person2();
    bjarke.name = "Bjarke";

    InstructorRole i2 = new InstructorRole();
    i2.courses.add("OOP");
    i2.courses.add("Java");

    bjarke.roles.add(i2);

    ConsultantRole c2 = new ConsultantRole();
    c2.levelOfCompetence = 8;

    bjarke.roles.add(c2);

    System.out.println(bjarke);
  }
}

class Person2
{
  ArrayList<Role> roles = new ArrayList<Role>();

  String name;

  @Override
  public String toString()
  {
    return "Person2[name=" + name + ", roles=" + roles + "]";
  }
}

class Role
{

}

class InstructorRole extends Role
{
  ArrayList<String> courses = new ArrayList<String>();

  @Override
  public String toString()
  {
    return "InstructorRole[courses=" + courses + "]";
  }
}

class ConsultantRole extends Role
{
  int levelOfCompetence;

  @Override
  public String toString()
  {
    return "ConsultantRole[levelOfCompetence=" + levelOfCompetence + "]";
  }
}
