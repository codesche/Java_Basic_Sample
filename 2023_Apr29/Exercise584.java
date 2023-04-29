

public class Exercise584 {
    public static void main(String[] args) {
        String origin = "book2s.com";
        String match = "o";
        String replacement = "O";
        System.out.println(replacementFirst(origin, match, replacement));
    }

    public static String replacementFirst(String origin, String match, String replacement) {
        StringBuffer sb = new StringBuffer(origin);
        int begin = origin.indexOf(match);
        if (begin != -1) {
            sb.delete(begin, begin + match.length());
            sb.insert(begin, replacement);
        }
        return sb.toString();
    }

}
