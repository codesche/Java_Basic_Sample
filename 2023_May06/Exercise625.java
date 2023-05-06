

public class Exercise625 {
    public static void main(String[] args) {
        String source = "book2s.com";
        int def = 42;
        System.out.println(ParseInt(source, def));
    }

    public static int ParseInt(String source, int def) {
        try {
            return Integer.parseInt(source);
        } catch (NumberFormatException e) {
            return def;
        }
    }

}
