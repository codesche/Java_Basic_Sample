

public class Exercise540 {
    public static void main(String[] args) {
        String sourceString = "book2s.com";
        String searchText = "o";
        System.out.println(countNumberOfOccurances(sourceString, searchText));
    }

    public static int countNumberOfOccurances(String sourceString, String searchText) {
        int idx = 0;
        int count = 0;

        boolean done = isEmpty(sourceString);
        while (!done) {
            idx = find(sourceString, searchText, false, idx);
            if (idx != -1) {
                idx++;
                count++;
            } else {
                done = true;
            }
        }
        return count;
    }

    public static boolean isEmpty(String str) {
        return ((str == null) || str.length() == 0);
    }

    public static int find(String sourceString, String findString) {
        return find(sourceString, findString, true);
    }

    public static int find(String sourceString, String findString, boolean caseSensitive) {
        return find(sourceString, findString, caseSensitive, 0);
    }

    public static int find(String sourceString, String findString,
                           boolean caseSensitive, int offset) {
        int retVal = -1;

        if (!isEmpty(sourceString) && !isEmpty(findString)) {
            try {
                if (!caseSensitive) {
                    retVal = sourceString.toLowerCase().indexOf(
                            findString.toLowerCase(), offset);
                } else {
                    retVal = sourceString.indexOf(findString, offset);
                }
            } catch (java.lang.StringIndexOutOfBoundsException ex) {
                // noting to do
            }
        }
        return retVal;
    }

    public static int length(String source) {
        int result = 0;
        if (isNotEmpty(source)) {
            result = source.length();
        }
        return result;
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

}
