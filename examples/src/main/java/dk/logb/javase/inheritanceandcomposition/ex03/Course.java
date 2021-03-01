package dk.logb.javase.inheritanceandcomposition.ex03;

import java.util.ArrayList;

public class Course
{
  private final ArrayList<Student> students = new ArrayList<Student>();

  private String name;

  // Bem�rk metoden ogs� sikrer student-objektet
  // f�r en reference til kursus-objektet
  public void addStudent(final Student student)
  {
    if (!this.students.contains(student))
    {
      // S�rg for kurset husker studenten
      this.students.add(student);
      // S�rg for at studenten husker kurset
      student.courses.add(this);
    }
  }

  // Bem�rk metoden ogs� sikrer student-objektet
  // f�r fjernet sin reference til kursus-objektet
  public void removeStudent(final Student student)
  {
    if (this.students.contains(student))
    {
      // S�rg for kurset glemmer den studerende
      students.remove(student);
      // S�rg for at studenten glemmer kurset
      student.courses.remove(this);
    }
  }

  public String getStudentsAsString()
  {
    return students.toString();
  }

  public Course(final String name)
  {
    this.setName(name);
  }

  public void setName(final String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  @Override
  public String toString()
  {
    return name;
  }
}
