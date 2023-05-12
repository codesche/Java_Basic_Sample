import java.util.StringTokenizer;

public class Exercise653 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Java|StringTokenizer|Example 1", "|");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken("|"));
        }
    }
}
