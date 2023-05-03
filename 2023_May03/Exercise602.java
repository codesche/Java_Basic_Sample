

public class Exercise602 {
    public static void main(String[] args) {
        StringBuffer orig = new StringBuffer();
        String origSub = "book2s.com";
        String newSub = "book2s.com";
        System.out.println(replaceAllSubstrings(orig, origSub, newSub));
    }

    static public StringBuffer replaceAllSubstrings(StringBuffer orig,
                                                    String origSub, String newSub) {
        StringBuffer result = new StringBuffer();
        result.append(replaceAllSubstrings(orig.toString(), origSub, newSub));
        return result;
    }

    static public String replaceAllSubstrings(String orig, String origSub, String newSub) {
        int first = orig.indexOf(origSub);
        if (first == -1) {
            return orig;
        }
        int last = first + origSub.length();
        String result = orig.substring(0, first);
        String rest = orig.substring(last);
        result = result + newSub + replaceAllSubstrings(rest, origSub, newSub);
        return result;
    }

}
