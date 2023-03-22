


public class Exercise197 {
    public static void main(String[] args) {
        int num = 1110;
        double realNum = 25.1115F;
        double veryBigNum = 215.8 / 0.0;
        double garbage = 0.0 / 0.0;
        boolean test = true;

        System.out.println("num = " + num);
        System.out.println("realNum = " + realNum);
        System.out.println("veryBigNum = " + veryBigNum);
        System.out.println("garbage = " + garbage);
        System.out.println("test = " + test);

        System.out.println ("Maximum int = " + Integer.MAX_VALUE);
        System.out.println ("Maximum double = " + Double.MAX_VALUE);
        System.out.println ("12.5 + 100 = " + (12.5 + 100));
        System.out.println ("12.5 - 100 = " + (12.5 - 100));
        System.out.println ("12.5 * 100 = " + (12.5 * 100));
        System.out.println ("12.5 / 100 = " + (12.5 / 100));
        System.out.println ("12.5 % 100 = " + (12.5 % 100));
        System.out.println ("\"abc\" + \"xyz\" = " + "\"" + ("abc" + "xyz") + "\"");
    }
}
