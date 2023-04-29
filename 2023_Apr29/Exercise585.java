

public class Exercise585 {
    public static void main(String[] args) {
        String string = "book2s.com";
        System.out.println(escapeForXML(string));
    }

    public static String escapeForXML(String string) {
        string = substitute(string, "&", "&amp;");
        string = substitute(string, "\"", "&quot;");
        string = substitute(string, "<", "&lt;");
        string = substitute(string, ">", "&gt;");
        string = substitute(string, "\n", "&#10;");
        string = substitute(string, "\r", "&#13;");     // Carriage return
        return string;
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
