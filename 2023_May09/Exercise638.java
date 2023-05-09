

public class Exercise638 {
    public static void main(String[] args) {
        String s = "book2s.com";
        int n = 42;
        System.out.println(padRight(s, n));
    }

    public static String padRight(String s, int n) {
        return String.format("%1$-" + n + "s", s);
    }

}
