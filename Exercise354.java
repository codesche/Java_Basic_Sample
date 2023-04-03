

public class Exercise354 {
    public static void main(String[] args) {
        int anInt = 1;
        long aLong = 22200L;
        byte aByte = 65;
        short aShort = -02;
        char aChar = 'A';
        float aFloat = 1111.98F;
        double aDouble = 999.89;

        System.out.println("anInt = " + anInt);
        System.out.println("aLong = " + aLong);
        System.out.println("aByte = " + aByte);
        System.out.println("aShort = " + aShort);
        System.out.println("aChar = " + aChar);
        System.out.println("aFloat = " + aFloat);
        System.out.println("aDouble = " + aDouble);
        System.out.println("aDouble = " + aDouble);

        // Print sone double constants
        System.out.println("Max double = " + Double.MAX_VALUE);
        System.out.println("Min double = " + Double.MIN_VALUE);
        System.out.println("Positive infinity for double = " + Double.POSITIVE_INFINITY);
        System.out.println("Negative infinity for double = " + Double.NEGATIVE_INFINITY);
        System.out.println("Not-a-Number for double = " + Double.NaN);
        System.out.println("double takes " + Double.BYTES + " bytes");
    }
}
