

public class Exercise565 {
    public static void main(String[] args) {
        String str = "book2s/.com/";
        System.out.println(trimAfterLastSlash(str));
    }

    public static String trimAfterLastSlash(String str) {
        if (str.lastIndexOf("/") > 0) {
            return str.substring(0, str.lastIndexOf("/"));
        }
        return str;
    }

}
