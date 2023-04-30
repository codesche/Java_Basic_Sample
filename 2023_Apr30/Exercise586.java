

public class Exercise586 {
    public static void main(String[] args) {
        String string = "book2s.com";
        String pattern = "o";
        String replacement = "O";
        System.out.println(substitute(string, pattern, replacement));
    }

    public static String substitute(String string, String pattern, String replacement) {
        int start = string.indexOf(pattern);

        while (start != -1) {
            StringBuffer buffer = new StringBuffer(string);
            buffer.delete(start, start + pattern.length());
            buffer.insert(start, replacement);
            string = new String(buffer);
            start = string.indexOf(pattern, start + replacement.length());
        }

        return string;
    }
}
