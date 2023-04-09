

public class Exercise414 {

    static String LowerToUpper(String s) {
        String result = "";
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = (char) (s.charAt(i) - 32);
            result += c;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(LowerToUpper("java2s.com"));
    }
}
