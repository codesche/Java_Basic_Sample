import java.io.UnsupportedEncodingException;

public class Exercise641 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] bytes = new byte[]{34,35,36,37,37,37,67,68,69};
        System.out.println(byte2str(bytes));
    }

    public static String byte2str(byte[] bytes) throws UnsupportedEncodingException {
        return new String(bytes, "UTF-8");
    }

}
