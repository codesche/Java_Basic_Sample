

public class Exercise104 {

    static int getDigitCount (int n) {
        String s = "" + n;
        return s.length();
    }

    public static void main(String[] args) {
        System.out.println(getDigitCount(3));
        System.out.println(getDigitCount(25));
        System.out.println(getDigitCount(333));
        System.out.println(getDigitCount(7876));
    }
}
