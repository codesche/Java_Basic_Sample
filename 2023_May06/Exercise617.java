import java.util.ArrayList;

public class Exercise617 {
    public static void main(String[] args) {
        String delimited = "book2s.com";
        System.out.println(java.util.Arrays.toString(parseCommaDelimited(delimited)));
    }

    public static String[] parseCommaDelimited(String delimited) {
        ArrayList<String> list;
        int pos;
        StringBuffer buf;
        String item;

        list = new ArrayList<String>();
        buf = new StringBuffer(delimited);
        while (buf.length() > 0) {
            for (pos = 0; pos < buf.length(); pos++) {
                if (buf.charAt(pos) == ',') {
                    break;
                }
            }
            item = buf.substring(0, pos);
            list.add(item);
            buf = buf.delete(0, pos + 1);
        }

        return (String[]) list.toArray(new String[list.size()]);
    }

}
