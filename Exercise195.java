

// Euclid's Greatest Common Divisor (GCD) - Java Language Basics
public class Exercise195 {
    public static void main(String[] args) {
        int a = 32;
        int b = 24;
        System.out.println("Computing GCD(" + a + "," + b + ")");

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("Greatest common divisor is " + a);
    }
}
