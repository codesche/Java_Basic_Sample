

public class Exercise637 {
    public static void main(String[] args) {
        String s = "book2s.com";
        int n = 42;
        System.out.println(padLeft(s, n));
    }

    public static String padLeft(String s, int n) {
        return String.format("%1$" + n + "s", s);
    }

}
