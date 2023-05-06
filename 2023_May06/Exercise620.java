

public class Exercise620 {
    public static void main(String[] args) {
        String s = "book2s.com";
        System.out.println(toInt(s));
    }

    public static int toInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        return Integer.parseInt(s);
    }

}
