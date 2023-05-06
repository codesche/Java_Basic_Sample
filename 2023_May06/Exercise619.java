

public class Exercise619 {
    public static void main(String[] args) {
        String str = "book2s.com";
        System.out.println(isNumber(str));
    }

    public static boolean isNumber(String str) {
        if (str == null) {
            return false;
        }

        int letters = 0;

        for (int i = 0, size = str.length(); i < size; i++) {
            if ((str.charAt(i) < 48) || (str.charAt(i) > 57)) {
                letters++;
            }
        }

        if ((letters > 1) || ((letters == 1) && (str.length() == 1))) {
            return false;
        }

        return true;
    }
}
