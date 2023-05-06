

public class Exercise624 {
    public static void main(String[] args) {
        String source = "book2s.com";
        boolean def = true;
        System.out.println(ParseBool(source, def));
    }

    public static boolean ParseBool(String source, boolean def) {
        try {
            return Boolean.parseBoolean(source);
        } catch (NullPointerException e) {
            return def;
        }
    }

}
