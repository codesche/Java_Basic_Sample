

public class Exercise640 {
    public static void main(String[] args) {
        String source = "book2s.com";
        int length = 42;
        char pad = 'a';
        boolean trailing = true;
        System.out.println(toPaddedString(source, length, pad, trailing));
    }

    public static String toPaddedString(String source, int length, char pad, boolean trailing) {
        int len = source.length();

        if (len >= length) {
            return source;
        }

        StringBuffer sb = new StringBuffer(length);

        if (trailing) {
            sb.append(source);
        }

        for (int i = len; i < length; i++) {
            sb.append(pad);
        }

        if (!trailing) {
            sb.append(source);
        }

        return sb.toString();
    }

}
