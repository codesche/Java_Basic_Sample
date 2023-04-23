

public class Exercise537 {
    public static void main(String[] args) {
        String string = "book2s.com";
        String delimiter = "o";
        System.out.println(substringAfterLast(string, delimiter));
    }

    public static String substringAfterLast(String string, String delimiter) {
        final int index = string.lastIndexOf(delimiter);
        if (index == -1 || string.endsWith(delimiter)) {
            return "";
        }
        return string.substring(index + 1);
    }

}
