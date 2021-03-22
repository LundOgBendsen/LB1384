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
