

public class Exercise533 {
    public static void main(String[] args) {
        String srcStr = "book2s.com";
        String cutStr = "com";
        System.out.println(cutRight(srcStr, cutStr));
    }

    public static String cutRight(final String srcStr, final String cutStr) {
        if (srcStr == null || cutStr == null) {
            return srcStr;
        }

        String retStr = srcStr;

        if (retStr.endsWith(cutStr)) {
            retStr = retStr.substring(0, retStr.length() - cutStr.length());
        }

        return retStr;
    }

}
