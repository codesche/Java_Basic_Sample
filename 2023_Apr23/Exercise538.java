

public class Exercise538 {
    public static void main(String[] args) {
        String string = "book2s.com";
        String delimiter = "o";
        System.out.println(substringBeforeFirst(string, delimiter));
    }

    public static String substringBeforeFirst(String string, String delimiter) {
        final int index = string.indexOf(delimiter);
        if (index == -1) {
            return "";
        }
        return string.substring(0, index);
    }

}
