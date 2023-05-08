

public class Exercise633 {
    public static void main(String[] args) {
        String str = "book2s.com";
        int len = 42;
        System.out.println(StringFillRightBlank(str, len));
    }

    public static String StringFillRightBlank(String str, int len) {
        if (str.length() < len) {
            StringBuffer sb = new StringBuffer(len);
            sb.append(str);
            for (int i = 0; i < len - str.length(); i++) {
                sb.append('0');
            }
            return new String(sb);
        } else {
            return str;
        }
    }

}
