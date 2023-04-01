import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercise338 {

    private static final Logger logger = Logger.getLogger("log.txt");

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        try {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number < 0) {
                throw new InvalidParameter2();
            }
            System.out.println("The number is: " + number);
        } catch (InputMismatchException | InvalidParameter2 e) {
            logger.log(Level.INFO, "Invalid input, try again");
        }
    }
}

class InvalidParameter2 extends java.lang.Exception {
    public InvalidParameter2() {
        super("Invalid Parameter");
    }
}
