

public class Exercise202 {
    public static void main(String[] args) {
        int result = 1 + 2;

        System.out.println("1 + 2 = " + result);
        int originial_result = result;

        result = result - 1;
        System.out.println(originial_result + " - 1 = " + result);
        originial_result = result;

        result = result * 2;
        System.out.println(originial_result + " * 2 = " + result);
        originial_result = result;

        result = result / 2;
        System.out.println(originial_result + " / 2 = " + result);
        originial_result = result;

        result = result + 8;
        System.out.println(originial_result + " + 8 = " + result);
        originial_result = result;

        result = result % 7;
        System.out.println(originial_result + " % 7 = " + result);

    }
}
