

public class Exercise582 {
    public static void main(String[] args) {
        String orig = "book2s.com";
        String origSub = "o";
        String newSub = "O";
        System.out.println(replaceLastSubstring(orig, origSub, newSub));
    }

    public static String replaceLastSubstring(String orig, String origSub, String newSub) {
        int first = orig.lastIndexOf(origSub);
        if (first == -1) {
            return orig;
        }
        int last = first + origSub.length();
        String result = orig.substring(0, first);
        result = result + newSub + orig.substring(last);
        return result;
    }
}
