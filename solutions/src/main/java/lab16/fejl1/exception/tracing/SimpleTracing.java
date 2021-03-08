package lab16.fejl1.exception.tracing;

public class SimpleTracing {

    public static void main(String[] args) {
        String message = null;
        printInUpperCase(message);
    }

    public static void printInUpperCase(String stringToPrint) {
        String stringInUpperCase = convertToUpperCase(stringToPrint);
        System.out.println(stringInUpperCase);
    }

    public static String convertToUpperCase(String stringIn) {
        String stringOut = stringIn.toUpperCase(); 
        return stringOut;
    }
}

/*
 * (a) Fejltypen er java.lang.NullPointerException
 * (b) Der står fx, at hvis man prøver at kalde en instans-metode på 
 * 	   et null-objekt, så resulterer det i en NullPointerException, 
 *     hvilket er netop hvad vi gør på stringIn i linie 16.
 * (c) Fejlen opstod i linie 16 ((SimpleCatching.java:16) og er herefter
 * 	   "boblet" videre op til linie 11 og senere til linie 7.
 * (d) Henvisningen til SimpleTracing.java:16 er med, fordi det var her 
 *     fejlen opstod.
 *     Henvisningen til SimpleTracing.java:11 er med, fordi det var i 
 *     denne linie, at metoden convertToUpperCase blev kaldt, og dette
 *     metodekald resulterede i en fejl.
 *     Henvisningen til SimpleTracing.java:7 er med, fordi det var i 
 *     denne linie, at metoden printInUpperCase blev kaldt, og dette
 *     metodekald resulterede i en fejl (fordi metoden kaldte en anden
 *     metode der resulterede i en fejl).
 */
