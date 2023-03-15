import java.util.StringTokenizer;

public class Exercise38 {
    public static void main(String[] args) {
        String str = "Hello, world. This is an example.";

        StringTokenizer st = new StringTokenizer(str);
        System.out.println(st.countTokens());
    }
}
