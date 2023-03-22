
// Newton's approximation algorithm - 근사 알고리즘
public class Exercise196 {
    public static void main(String[] args) {
        double a = 2.0, x, xold;
        x = a;
        do {
            xold = x;
            // compute one iteration
            x = (xold + a / xold) / 2.0;
            System.out.println(x);
        } while (Math.abs(x - xold) > 1e-10);
    }
}
