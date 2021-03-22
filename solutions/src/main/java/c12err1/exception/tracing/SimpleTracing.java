package c12err1.exception.tracing;

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
 * (a) The error is java.lang.NullPointerException
 * (b) It sya that if you call a method on a null reference it will 
 *     result in a NullPointerException, and that is just what we do 
 *     in line 16 with stringIn. 
 * (c) The error arose in line 16 ((SimpleCatching.java:16) and then 
 *     propagated to line 11 and line 7
 * (d) SimpleTracing.java:16 is mentioned because this is where the 
 *     error happened.
 *     SimpleTracing.java:11 is mentioned because this is where
 *     the method convertToUpperCase was called and ultimately resulted
 *     in the error.
 *     SimpleTracing.java:7 is mentioned because this is where the method
 *     printInUpperCase was called and this ultimately resulted in an
 *     error (because the method called another method that resulted in
 *     an error)
 */
