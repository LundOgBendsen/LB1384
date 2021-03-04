package dk.logb.javase.c09arrays.ex02;

/*
 * Demonstrates how to model a company that offers many courses using an ArrayList
 */
import java.util.ArrayList;

public class Company {
	String name;

	ArrayList<Course> courses = new ArrayList<Course>();

	public Company(final String name) {
		this.name = name;
	}

	void addKursus(final Course course) {
		this.courses.add(course);
	}

	Course getCourseAt(final int index) {
		Course course;
		course = this.courses.get(index);
		return course;
	}

	int getNumberOfCourses() {
		int antal = this.courses.size();
		return antal;
	}

	@Override
	public String toString() {
		/* Note that ArrayList has a sensible impementation of toString()*/
		String s = "Company[" + name + ", Courses[" + courses + "]";
		return s;
	}

	public static void main(final String[] args) {
		Company firma = new Company("KursusButikken ApS");
		firma.addKursus(new Course(1, "VBA"));
		firma.addKursus(new Course(2, "C#"));
		firma.addKursus(new Course(3, "Java"));
		System.out.println(firma);
	}

}

class Course {
	int number;

	String name;

	public Course(final int number, final String name) {
		super();
		this.number = number;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Course[" + number + ", " + name + "]";
	}
}
