package lab20.fejl5.handling.exceptions;

public class FourWaysOfHandlingExceptions {

    public static void main(String[] args) {

        /* Demonstrates how to catch and handle an exception */
        catchAndHandleException();

        /* Demonstrates how to catch and convert one exception into another */
        try {
            catchAndConvertException();
        } catch (MyRethrownException e) {
            System.out.println("Caught converted exception in main");
        }

        /* Demonstrates how to re-throw an exception */
        try {
            rethrowException();
        } catch (MyCheckedException e1) {
            System.out.println("Caught rethrown exception");
        }

        /* Demonstrates ignoring an exception */
        ignoreException();
    }

    private static void catchAndHandleException() {
        try {
            throwMyCheckedException();
        } catch (MyCheckedException e) {
            System.out.println("Caught and handled exception");
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
