import java.util.Scanner;

public class Exercise387 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double lambda = scan.nextDouble();
        int k = scan.nextInt();
        scan.close();

        System.out.println(poisson(k, lambda));
    }

    private static double poisson(int k, double lambda) {
        return (Math.pow(lambda, k) * Math.pow(Math.E, -1 * lambda)) / factorial(k);
    }

    private static Long factorial(int n) {
        if (n < 0) {
            return null;
        }
        long result = 1;
        while (n > 0) {
            result *= n--;
        }
        return result;
    }

}
