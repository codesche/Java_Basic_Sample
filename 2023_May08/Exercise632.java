

public class Exercise632 {
    public static void main(String[] args) {
        String str = "book2s.com";
        int len = 42;
        System.out.println(StringFillLeftZero(str, len));
    }

    public static String StringFillLeftZero(String str, int len) {
        if (str.length() < len) {
            StringBuffer sb = new StringBuffer(len);
            for (int i = 0; i < len - str.length(); i++) {
                sb.append('0');
            }
            sb.append(str);
            return new String(sb);
        } else {
            return str;
        }
    }

}
