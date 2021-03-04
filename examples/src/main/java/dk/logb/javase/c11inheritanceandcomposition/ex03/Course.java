package dk.logb.javase.c11inheritanceandcomposition.ex03;

import java.util.ArrayList;

/**
 * 
 * Shows the necessary book-keeping in a many to many relationship
 */
public class Course {
	private final ArrayList<Student> students = new ArrayList<Student>();

	private String name;

	public void addStudent(final Student student) {
		/* Note how this guards against adding a student twice */
		if (!this.students.contains(student)) {
			/* Add the student to the course */
			this.students.add(student);
			/* Add the course to the student */
			student.courses.add(this);
		}
	}

	public void removeStudent(final Student student) {
		if (this.students.contains(student)) {
			/* remove the student from the course */
			students.remove(student);
			/* remove the course from the student */
			student.courses.remove(this);
		}
	}

	public String getStudentsAsString() {
		return students.toString();
	}

	public Course(final String name) {
		this.setName(name);
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}
}
