import java.util.StringTokenizer;

public class Exercise368 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Java StringTokenizer count Tokens Example");
        while (st.hasMoreTokens()) {
            System.out.println("Remaining Tokens : " + st.countTokens());
            System.out.println(st.nextToken());
        }
    }
}
