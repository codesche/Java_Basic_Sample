

public class Exercise401 {
    public static void main(String[] args) {
        System.out.println(roundFloatToInt(new Float("8.837")));
        System.out.println(roundDoubleToLong(new Double("9.9")));
    }

    public static int roundFloatToInt(float myFloat) {
        return Math.round(myFloat);
    }

    public static long roundDoubleToLong(double myDouble) {
        return Math.round(myDouble);
    }
}
