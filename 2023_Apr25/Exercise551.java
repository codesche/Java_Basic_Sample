

public class Exercise551 {
    public static void main(String[] args) {
        String source = "book2s.com";
        char substitute = 'a';
        System.out.println(toLowerSubset(source, substitute));
    }

    public static String toLowerSubset(String source, char substitute) {
        int len = source.length();
        StringBuffer sb = new StringBuffer(len);
        char ch;

        for (int i = 0; i < len; i++) {
            ch = source.charAt(i);

            if (!Character.isLetterOrDigit(ch)) {
                sb.append(substitute);
            } else if ((i == 0) && Character.isDigit(ch)) {
                sb.append(substitute);
            } else {
                sb.append(Character.toLowerCase(ch));
            }
        }
        return sb.toString();
    }

}
