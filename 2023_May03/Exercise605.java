

public class Exercise605 {
    public static void main(String[] args) {
        String s = "book2s.com";
        String f = "o";
        String r = "O";
        System.out.println(replace(s, f, r));
    }

    public static String replace(String s, String f, String r) {
        if (s == null) {
            return s;
        }
        if (f == null) {
            return s;
        }
        if (r == null) {
            r = "";
        }

        int index01 = s.indexOf(f);
        while (index01 != -1) {
            s = s.substring(0, index01) + r
                    + s.substring(index01 + f.length());
            index01 += r.length();
            index01 = s.indexOf(f, index01);
        }
        return s;
    }

}
