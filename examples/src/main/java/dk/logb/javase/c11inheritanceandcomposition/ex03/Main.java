package dk.logb.javase.c11inheritanceandcomposition.ex03;

/*
 * Demonstrates association where Course objects can know several Student objects and vice versa.
 * This is known as a bidirectional many-to-many relationship.
 */

public class Main {
	public static void main(final String[] args) {

		Course[] course = new Course[3];
		course[0] = new Course("Programming fundamentals");
		course[1] = new Course("Object oriented programming");
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

		System.out.println("*** COURSES ***");

		for (int n = 0; n < 3; n++) {
			System.out.print("The course " + course[n]);
			System.out.println("  is taken by: " + course[n].getStudentsAsString());
		}

		System.out.println();
		System.out.println("*** STUDENTS ***");
		for (int n = 0; n < 7; n++) {
			System.out.print(student[n] + " is taking the courses: ");
			System.out.println(student[n].getCoursesAsString());
		}
	}
}
