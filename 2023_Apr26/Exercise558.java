

public class Exercise558 {
    public static void main(String[] args) {
        String source = "book2s.com";
        String trim = "book2s.com";
        System.out.println(trimFront(source, trim));
    }

    public static String trimFront(String source, String trim) {
        if (source == null) {
            return null;
        }
        if (source.indexOf(trim) == 0) {
            return trimFront(source.substring(trim.length()), trim);
        } else {
            return source;
        }
    }
}
