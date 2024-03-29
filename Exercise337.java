import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercise337 {

    private static final Logger logger = Logger.getLogger("log.txt");

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        try {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number < 0) {
                throw new InvalidParameter();
            }
            System.out.println("The number is: " + number);
            if (number > 10) {
                throw new AssertionError("Number was too big", new Throwable("Throwable assertion message"));
            }
        } catch (InputMismatchException | InvalidParameter e) {
            logger.log(Level.INFO, "Invalid input, try again");
            e.addSuppressed(new Throwable());
            System.out.println("Invalid input, try again");
        } catch (final Exception e) {
            logger.log(Level.INFO, "Invalid input, try again");
            System.out.println("Invalid input, try again");
        }
    }
}

class InvalidParameter extends java.lang.Exception {
    public InvalidParameter() {
        super("Invalid Parameter");
    }
}