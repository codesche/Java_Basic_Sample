

public class Exercise536 {
    public static void main(String[] args) {
        String string = "book2s.com";
        String delimiter = "book";
        System.out.println(substringAfterFirst(string, delimiter));
    }

    public static String substringAfterFirst(String string, String delimiter) {
        final int index = string.indexOf(delimiter);
        if (index == -1) {
            return "";
        }
        return string.substring(index + delimiter.length());
    }

}
