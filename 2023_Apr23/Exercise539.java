

public class Exercise539 {
    public static void main(String[] args) {
        String string = "book2s.com";
        String delimiter = "book2s.com";
        System.out.println(substringBeforeLast(string, delimiter));
    }

    public static String substringBeforeLast(String string, String delimiter) {
        final int index = string.lastIndexOf(delimiter);
        if (index == -1 || string.startsWith(delimiter)) {
            return "";
        }
        return string.substring(0, index);
    }
}
