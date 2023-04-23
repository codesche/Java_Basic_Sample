

public class Exercise534 {
    public static void main(String[] args) {
        String string = "book2s.com";
        int limit = 4;
        System.out.println(ellipsizeString(string, limit));
    }

    public static String ellipsizeString(String string, int limit) {
        String retValue = "";
        if (string != null) {
            if (string.length() > limit) {
                retValue = string.substring(0, limit) + "...";
            } else {
                retValue = string;
            }
        }
        return retValue;
    }

}
