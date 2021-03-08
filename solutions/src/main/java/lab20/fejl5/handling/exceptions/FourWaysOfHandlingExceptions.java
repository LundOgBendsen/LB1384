package lab20.fejl5.handling.exceptions;

public class FourWaysOfHandlingExceptions {

    public static void main(String[] args) {

        // Illustrerer gribning og håndtering af en fejl
        catchAndHandleException();

        // Illustrerer gribning af en fejl og konvertering til en ny
        try {
            catchAndConvertException();
        } catch (MyRethrownException e) {
            System.out.println("Caught converted exception in main");
        }

        // Illustrerer viderekastning af en fejl
        try {
            rethrowException();
        } catch (MyCheckedException e1) {
            System.out.println("Caught rethrown exception");
        }

        // Illustrerer ignorering af en fejl
        ignoreException();
    }

    private static void catchAndHandleException() {
        try {
            throwMyCheckedException();
        } catch (MyCheckedException e) {
            System.out.println("Caught and handled exception");
            ;
        }
    }

    private static void catchAndConvertException() throws MyRethrownException {
        try {
            throwMyCheckedException();
        } catch (MyCheckedException e) {
            throw new MyRethrownException();
        }
    }

    private static void rethrowException() throws MyCheckedException {
        throwMyCheckedException();
    }

    private static void ignoreException() {
        throwMyUncheckedException();
    }

    public static void throwMyCheckedException() throws MyCheckedException {
        throw new MyCheckedException();
    }

    public static void throwMyUncheckedException() {
        throw new MyUncheckedException();
    }
}
