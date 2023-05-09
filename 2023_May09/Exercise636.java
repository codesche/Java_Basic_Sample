

public class Exercise636 {
    public static void main(String[] args) {
        String s = "book2s.com";
        int width = 42;
        boolean alignRight = true;
        System.out.println(pad(s, width, alignRight));
    }

    public static String pad(String s, int width, boolean alignRight) {
        return pad(s, width, alignRight, ' ');
    }

    public static String pad(String s, int width, boolean alignRight, char padSymbol) {
        int padWidth = Math.max(0, width - s.length());
        StringBuffer pad = new StringBuffer();
        for (int i = 0; i < padWidth; i++) {
            pad.append(padSymbol);
        }
        if (alignRight) {
            return pad + s;
        } else {
            return s + pad;
        }
    }

}
