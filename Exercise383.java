import java.util.Scanner;

public class Exercise383 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numerator = scan.nextInt();
        int denominator = scan.nextInt();
        int n = scan.nextInt();
        scan.close();

        /* Geometric Series */
        double p = (double) numerator / denominator;
        System.out.printf("%.3f", geometric(n, p));
    }

    private static double geometric (int n, double p) {
        return Math.pow(1 - p, n - 1) * p;
    }

    private static Long combinations(int n, int x) {
        if (n < 0 || x < 0 || x > n) {
            return null;
        }
        return factorial(n) / (factorial(x) * factorial(n - x));
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
