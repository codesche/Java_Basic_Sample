

public class Exercise549 {
    public static void main(String[] args) {
        String str = "book2s.com";
        String remove = "book2s";
        System.out.println(removeStart(str, remove));
    }

    public static String removeStart(String str, String remove) {
        if (isEmpty(str) || isEmpty(remove)) {
            return str;
        }
        if (str.startsWith(remove)) {
            return str.substring(remove.length());
        }
        return str;
    }

    public static boolean isEmpty(String chkStr) {
        if (chkStr == null) {
            return true;
        } else {
            return "".equals(chkStr.trim()) ? true : false;
        }
    }

}
