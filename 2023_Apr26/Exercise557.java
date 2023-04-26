
public class Exercise557 {
    public static void main(String[] args) {
        String text = "book2s.com";
        String suffix = "com";
        System.out.println(trimSuffix(text, suffix));
    }

    public static final String trimSuffix(final String text, final String suffix) {
        if (text == null) {
            return null;
        }
        if (suffix == null) {
            return text;
        }
        if (text.endsWith(suffix)) {
            return text.substring(0, text.length() - suffix.length());
        }
        return text;
    }

}
