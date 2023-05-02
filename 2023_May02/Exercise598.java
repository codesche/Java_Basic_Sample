

public class Exercise598 {
    public static void main(String[] args) {
        String str = "book2s.com";
        String pattern = "o";
        String replace = "O";
        System.out.println(replace(str, pattern, replace));
    }

    public static String replace(String str, String pattern, String replace) {
        int s = 0;
        int e;
        StringBuffer result = new StringBuffer();

        while ((e = str.indexOf(pattern, s)) >= 0) {
            result.append(str.substring(s, e));
            result.append(replace);
            s = e + pattern.length();
        }
        result.append(str.substring(s));
        return result.toString();
    }

}
