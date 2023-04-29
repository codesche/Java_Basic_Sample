

public class Exercise581 {
    public static void main(String[] args) {
        String orig = "book2s.com";
        String origSub = "o";
        String newSub = "O";
        System.out.println(replaceFirstSubstring(orig, origSub, newSub));
    }

    static public String replaceFirstSubstring(String orig, String origSub, String newSub) {
        int first = orig.indexOf(origSub);
        if (first == -1) {
            return orig;
        }
        int last = first + origSub.length();
        String result = orig.substring(0, first);
        result = result + newSub + orig.substring(last);
        return result;
    }
}
