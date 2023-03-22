

public class Exercise193 {
    public static void main(String[] args) {
        double a, b, c;
        a = Math.sqrt(3.0);
        b = 2.0;
        c = -3.0;
        double delta = b * b - 4.0 * a * c;
        double root1, root2;
        root1 = (-b - Math.sqrt(delta)) / (2.0 * a);
        root2 = (-b + Math.sqrt(delta)) / (2.0 * a);
        System.out.println(root1);
        System.out.println(root2);
        System.out.println("Let us check the roots");
        System.out.println(a * root1 * root1 + b * root1 + c);
        System.out.println(a * root2 * root2 + b * root2 + c);
    }
}
