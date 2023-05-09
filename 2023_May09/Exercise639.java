

public class Exercise639 {
    public static void main(String[] args) {
        String sp = "book2s.com";
        int total = 42;
        System.out.println(blankPad(sp, total));
    }

    public static String blankPad(String sp, int total) {
        StringBuffer sb = new StringBuffer();
        int nta = total - sp.length();
        sb.append(sp);
        for (int i = 0; i < nta; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }

}
