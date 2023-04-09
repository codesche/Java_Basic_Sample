import java.util.Scanner;

public class Exercise413 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        double A = stdIn.nextDouble();
        double B = stdIn.nextDouble();

        stdIn.close();

        System.out.println(A / B);
    }
}
