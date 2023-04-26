

public class Exercise556 {
    public static void main(String[] args) {
        String text = "abook2s.com";
        String prefix = "a";
        System.out.println(trimPrefix(text, prefix));
    }

    public static final String trimPrefix(final String text, final String prefix) {
        if (text == null) {
            return null;
        }
        if (prefix == null) {
            return text;
        }
        if (text.startsWith(prefix)) {
            return text.substring(prefix.length());
        }
        return text;
    }

    public static boolean startsWith(final String text, final String fragment) {
        return startsWithIgnoreCase(text, fragment);
    }

    public static boolean startsWithIgnoreCase(final String target1, final String target2) {
        if (target1 == null || target2 == null) {
            return false;
        }
        int length1 = target1.length();
        int length2 = target2.length();
        if (length1 < length2) {
            return false;
        }
        String s1 = target1.substring(0, target2.length());
        return s1.equalsIgnoreCase(target2);
    }

    public static boolean equalsIgnoreCase(final String target1, final String target2) {
        return (target1 == null) ? (target2 == null) : target1.equalsIgnoreCase(target2);
    }

}
