

public class Exercise583 {
    public static void main(String[] args) {
        String text = "book2s.com";
        String fromText = "o";
        String toText = "O";
        System.out.println(replace(text, fromText, toText));
    }

    public static final String replace(final String text, final String fromText, final String toText) {
        if (text == null || fromText == null || toText == null) {
            return null;
        }

        StringBuilder buf = new StringBuilder(100);
        int pos = 0;
        int pos2 = 0;
        while (true) {
            pos = text.indexOf(fromText, pos2);
            if (pos == 0) {
                buf.append(toText);
                pos2 = fromText.length();
            } else if (pos > 0) {
                buf.append(text.substring(pos2, pos));
                buf.append(toText);
                pos2 = pos + fromText.length();
            } else {
                buf.append(text.substring(pos2));
                break;
            }
        }
        return buf.toString();
    }
}
