

public class Exercise655 {
    public static void main(String[] args) {
        String str = "book2s.com";
        System.out.println(toUpperCase(str));
    }

    public static String toUpperCase(String str) {
        StringBuffer buffer = new StringBuffer(str);
        for (int i = 0; i < buffer.length(); i++) {
            char c = buffer.charAt(i);
            buffer.setCharAt(i, Character.toUpperCase(c));
        }
        return buffer.toString();
    }

}
