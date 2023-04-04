import java.util.StringTokenizer;

public class Exercise369 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Java StringTokenizer Example");
        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }
    }
}
