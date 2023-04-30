

public class Exercise588 {
    public static void main(String[] args) {
        String raw = "b oo   k2s.com";
        System.out.println(replaceAllEmpty(raw));
    }

    public static String replaceAllEmpty(String raw) {
        if (isEmpty(raw)) {
            return raw;
        }
        raw = raw.trim();
        String[] empties = new String[]{ " ", "\r", "\n" };
        for (String string : empties) {
            raw = raw.replaceAll(string, "");
        }
        return raw;
    }

    public static boolean isEmpty(String raw) {
        if (raw == null || raw.trim().length() == 0 || "null".equals(raw.trim())) {
            return true;
        }
        return false;
    }

}
