

public class Exercise567 {
    public static void main(String[] args) {
        String s = "    book2s.com      ";
        System.out.println(strip(s));
    }

    public static String strip(String s) {
        StringBuffer sb = new StringBuffer();
        int spaces = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (spaces > 0) {
                    return (sb.toString());
                } else {
                    spaces++;
                }
            } else {
                sb.append(s.charAt(i));
                spaces = 0;
            }
        }
        return (sb.toString());
    }

}
