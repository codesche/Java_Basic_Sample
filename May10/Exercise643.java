import java.io.UnsupportedEncodingException;

public class Exercise643 {
    public static void main(String[] args) {
        String string = "book2s.com";
        System.out.println(java.util.Arrays.toString(toBytes(string)));
    }

    public static byte[] toBytes(String string) {
        try {
            return string.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

}
