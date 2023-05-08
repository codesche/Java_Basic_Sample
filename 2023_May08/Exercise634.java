

public class Exercise634 {
    public static void main(String[] args) {
        String val = "book2s.com";
        char c = 'a';
        int maxlen = 42;
        System.out.println(leftFillChar(val, c, maxlen));
    }

    public static String leftFillChar(String val, char c, int maxlen) {
        StringBuffer sb = new StringBuffer();
        if (val.length() < maxlen) {
            for (int i = 0; i < maxlen - val.length(); i++) {
                sb.append('0');
            }
        }
        sb.append(val);
        return sb.toString();
    }

}
