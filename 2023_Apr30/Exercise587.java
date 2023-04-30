

public class Exercise587 {
    public static void main(String[] args) {
        String original = "book2s.com";
        String replaceFrom = "o";
        String replaceTo = "O";
        System.out.println(replace(original, replaceFrom, replaceTo));
    }

    private static final String EMPTY_STRING = "";

    public static String replace(String original, String replaceFrom, String replaceTo) {
        if (EMPTY_STRING.equals(replaceFrom)) {
            return original;
        }

        if (original.indexOf(replaceFrom) == -1) {
            return original;
        }

        StringBuffer buf = new StringBuffer(original.length());
        int index = 0;

        for (;;) {
            int pos = original.indexOf(replaceFrom, index);

            if (pos == -1) {
                buf.append(original.substring(index));

                return buf.toString();
            }

            buf.append(original.substring(index, pos));
            buf.append(replaceTo);
            index = pos + replaceFrom.length();

            if (index == original.length()) {
                return buf.toString();
            }
        }
    }

    public static int indexOf(char character, String str, int x) {
        for (int i = 0, pos = -1; (pos = str.indexOf(character, pos + 1)) > -1 ; i++) {
            if (i == x) {
                return pos;
            }
        }
        return -1;
    }
}
