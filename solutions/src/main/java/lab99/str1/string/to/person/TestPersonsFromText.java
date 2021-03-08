package lab99.str1.string.to.person;

import java.util.ArrayList;

public class TestPersonsFromText
{

  public static void main(final String[] args)
  {
    Person p = Person.createPersonFromString("Lise Lotte, Jensen, 1998");
    System.out.println(p);

    ArrayList<Person> persons = Person.createPersonsFromString(getPersonsAsText());
    System.out.println(persons);
  }

  static String getPersonsAsText()
  {
    return
        "Lise Lotte, Jensen, 1998" + '\n' +
        "Ib, Sørensen, 1956" + '\n' +
        "Kurt, Jensen, 1994" + '\n' +
        "Sigrid, Munk Madsen, 1981";
  }
}
