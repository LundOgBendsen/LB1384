package c09arr5.dogs.and.kennels;

import java.util.ArrayList;

public class Dog
{

  String name;
  Dog father;
  Dog mother;

  ArrayList<Dog> offspring = new ArrayList<Dog>();

  Dog(final String name)
  {
    this(name, null, null);
  }

  public Dog(final String name, final Dog father, final Dog mother)
  {
    setName(name);
    setFather(father);
    setMother(mother);
  }

  public Dog getFather()
  {
    return father;
  }

  public void setFather(final Dog father)
  {
    if (father != null)
    {
      // remove previously registered father
      if (this.father != null)
      {
        this.father.offspring.remove(this);
      }
      this.father = father;
      father.getOffspring().add(this);
    }
  }

  public Dog getMother()
  {
    return mother;
  }

  public void setMother(final Dog mother)
  {
    if (mother != null)
    {
      // remove previously registered mother
      if (this.mother != null)
      {
        this.mother.offspring.remove(this);
      }
      this.mother = mother;
      mother.getOffspring().add(this);
    }
  }

  public String getName()
  {
    return name;
  }

  public void setName(final String name)
  {
    this.name = name;
  }

  public ArrayList<Dog> getOffspring()
  {
    return offspring;
  }

  @Override
  public String toString()
  {
    return "Dog[name=" + getName() + "]";
  }

  public String deepToString()
  {
    return "Dog[name=" + getName() + ",father=" + father + ",mother=" + mother + ",offspring=" + offspring + "]";
  }
}
