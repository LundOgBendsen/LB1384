package dk.logb.javase.inheritanceandcomposition.ex03;

/*
 * Viser ex p� brugen af associering. Det illustreres hvordan
 * Course-objekter kan referere til flere Student-objekter
 * og omvendt vha. et ArrayList-objekt i begge klasser.
 * Kaldes et "bidirectional many-to-many relationship".
 */

public class Main
{
  public static void main(final String[] args)
  {

    Course[] course = new Course[3];
    course[0] = new Course("Grundl�ggende Programmering");
    course[1] = new Course("Objektorienteret Programmering");
    course[2] = new Course("Computer Supported Cooperative Work");

    Student[] student = new Student[7];
    student[0] = new Student("Erik");
    student[1] = new Student("Birger");
    student[2] = new Student("Lise");
    student[3] = new Student("Otto");
    student[4] = new Student("Frederik");
    student[5] = new Student("Signe");
    student[6] = new Student("Josef");

    course[0].addStudent(student[0]);
    course[0].addStudent(student[3]);
    course[0].addStudent(student[4]);
    course[0].addStudent(student[5]);

    course[1].addStudent(student[1]);
    course[1].addStudent(student[2]);
    course[1].addStudent(student[3]);
    course[1].addStudent(student[6]);

    course[2].addStudent(student[3]);
    course[2].addStudent(student[6]);

    System.out.println("*** COURSES***");

    for (int n = 0; n < 3; n++)
    {
      System.out.print("Kurset " + course[n]);
      System.out.println(" f�lges af: " + course[n].getStudentsAsString());
    }

    System.out.println();
    System.out.println("*** STUDENTS ***");
    for (int n = 0; n < 7; n++)
    {
      System.out.print(student[n] + " f�lger kurserne: ");
      System.out.println(student[n].getCoursesAsString());
    }
  }
}
