import java.util.StringTokenizer;

public class Exercise367 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Java StringTokenizer count Tokens Example");
        while (st.hasMoreTokens()) {
            System.out.println("Remain Tokens : " + st.countTokens());
            System.out.println(st.nextToken());
        }
    }
}
