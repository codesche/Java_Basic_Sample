

public class Exercise618 {
    public static void main(String[] args) {
        String existing = "book2s.com";
        String value = "book2s.com";
        System.out.println(addCommaDelimited(existing, value));
    }

    public static String addCommaDelimited(String existing, String value) {
        return existing + "," + value;
    }

}
