import java.io.UnsupportedEncodingException;

public class Exercise642 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "book2s.com";
        System.out.println(java.util.Arrays.toString(str2byte(str)));
    }

    public static byte[] str2byte(String str) throws UnsupportedEncodingException {
        return str.getBytes("UTF-8");
    }

}
