

public class Exercise244 {

    static int factorial(int n) {
        int result = 1;

        while (n > 0) {
            result *= n;
            n--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("6!=" + factorial(6));
    }
}
