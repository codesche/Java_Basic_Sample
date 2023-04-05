import java.util.StringTokenizer;

public class Exercise371 {
    public static void main(String[] args) {
        StringTokenizer st1 = new StringTokenizer("Java|StringTokenizer|Example 1", "|");

        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer("Java|StringTokenizer|Example 2");

        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken("|"));
        }
    }
}
