

public class Exercise542 {
    public static void main(String[] args) {
        String name = "book2s.com";
        String prefix = "b";
        String delimiter = ".";
        System.out.println(substringInBetween(name, prefix, delimiter));
    }

    public static String substringInBetween(String name, String prefix, String delimiter) {
        int startPos = 0;
        if (prefix != null) {
            startPos = prefix.length() + 1;
        }

        int endPos = name.indexOf(delimiter, startPos);
        if (endPos > 0) {
            return name.substring(startPos, endPos);
        }

        return null;
    }

}
