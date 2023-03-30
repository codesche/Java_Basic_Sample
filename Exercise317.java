

public class Exercise317 {
    public static void main(String[] args) {
        int x = 10, y = 0, z;
        try {
            z = x / y;
            System.out.println("z = " + z);
        } catch (ArithmeticException e) {
            String msg = e.getMessage();

            // Print a custom error message
            System.out.println("An error has occured. The error is: " + msg);
        }
        System.out.println("At the end of the program");
    }
}
