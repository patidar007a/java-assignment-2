import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class ExceptionHandling {
    public static void handleException(Exception e) {
        System.err.println("An error occurred: " + e.getMessage());
    }

    public static void handleInputMismatchException(InputMismatchException e) {
        System.err.println("Input mismatch: " + e.getMessage());
    }

    public static void handleNoSuchElementException(NoSuchElementException e) {
        System.err.println("No such element: " + e.getMessage());
    }

    public static void handleIllegalArgumentException(IllegalArgumentException e) {
        System.err.println("Illegal argument: " + e.getMessage());
    }
}
