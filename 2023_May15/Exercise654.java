import java.util.StringTokenizer;

public class Exercise654 {
    public static void main(String[] args) {
        // 1. Using StringTokenizer constructor
        StringTokenizer st1 = new StringTokenizer("Java|StringTokenizer|Example 1", "|");

        // iterate through tokens
        while (st1.hasMoreTokens())
            System.out.println(st1.nextToken());

        // 2. Using nextToken() method. Note that the new delimiter set remains the
        // default after this method call
        StringTokenizer st2 = new StringTokenizer("Java|StringTokenizer|Example 2");

        // iterate through tokens
        while (st2.hasMoreTokens())
            System.out.println(st2.nextToken("|"));
    }
}
