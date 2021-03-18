package lab15.genbr1.inheritance.vs.composition;

import java.util.ArrayList;

public class UsingInheritance {
	public static void main(final String[] args) {

		Instructor i = new Instructor();
		i.name = "Jens";
		i.courses.add("OOP");
		i.courses.add("OOA&D");
		i.courses.add("Java");
		System.out.println(i);

		Consultant c = new Consultant();
		c.name = "Sif";
		c.levelOfCompetence = 12;
		System.out.println(c);
	}
}

class Person {
	String name;
}

class Instructor extends Person {
	ArrayList<String> courses = new ArrayList<String>();

	@Override
	public String toString() {
		return "Instructor[name=" + name + ", courses=" + courses + "]";
	}
}

class Consultant extends Person {
	int levelOfCompetence;

	@Override
	public String toString() {
		return "Consultant[name=" + name + ", levelOfCompetence=" + levelOfCompetence + "]";
	}
}
