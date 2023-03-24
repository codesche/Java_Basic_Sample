

public class Exercise229 {
    public static void main(String[] args) {
        double x = Math.E;

        System.out.println("Choose function to evalute for x=" + x);
        System.out.print("(1) Identity, (2) Logarithm, (3) Sinus.Your choice ?");

        System.out.println("F(x)=" + F(2, x));
    }

    public static double F(int generator, double x) {
        double v = 0.0;

        switch (generator) {
            case 1:
                v = x;
                break;
            case 2:
                v = Math.log(x);
                break;
            case 3:
                v = Math.sin(x);
                break;
        }

        return v;
    }
}
