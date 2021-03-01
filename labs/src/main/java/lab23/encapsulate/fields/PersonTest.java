package lab23.encapsulate.fields;

public class PersonTest {

    public static void main(String[] args) {
        System.out.println("main-metode: start");
        
        Person p01 = new Person("Rasmus", "Lund", 1973);
        System.out.println(p01);
        
        Person p02 = new Person("Hans", "Jensen");
        System.out.println(p02);
		
		System.out.println("antal personer " + Person.getTotalNumberOfPersons());
        
        System.out.println("main-metode: slut");
    }
}
