package dk.logb.javase.c11inheritanceandcomposition.ex03;

import java.util.ArrayList;

public class Student {
	ArrayList<Course> courses = new ArrayList<>();

	private String name;

	public String getCoursesAsString() {
		return courses.toString();
	}

	public Student(final String name) {
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
