

public class Exercise596 {
    public static void main(String[] args) {
        String src = "book2s.com";
        String replace = "o";
        String dest = "O";
        System.out.println(replaceAll(src, replace, dest));
    }

    public static String replaceAll(String src, String replace, String dest) {
        StringBuffer buf = new StringBuffer(src);
        String m_dest = "";

        if (dest != null) {
            m_dest = dest;
        }

        int i = 0;

        while ((i = buf.indexOf(replace, i)) != -1) {
            buf = new StringBuffer(buf.subSequence(0, i) + m_dest
                    + buf.substring(i + replace.length()));

            i += m_dest.length();
        }
        return buf.toString();
    }

}
