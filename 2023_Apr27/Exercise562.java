

public class Exercise562 {
    public static void main(String[] args) {
        String searchString = "book2s.com";
        String searchStringList = "b";
        System.out.println(inAndNotEmpty(searchString, searchStringList));
    }

    public static boolean inAndNotEmpty(final String searchString, final String... searchStringList) {
        if (searchString == null) {
            return false;
        }
        if (searchStringList.length == 0) {
            throw new IllegalArgumentException(
                "argument SearchStringList must have length > 0");
        }
        final String trimmedString = searchString.trim();
        if (trimmedString.equals("")) {
            return false;
        }

        for (final String s : searchStringList) {
            if (s.equals(trimmedString)) {
                return true;
            }
        }
        return false;
    }

}
