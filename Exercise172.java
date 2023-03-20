

public class Exercise172 {

    public static int addN(int x, int y) {
        int add = x + y;
        return add;
    }

    public static int timesN(int x, int y) {
        int times = x * y;
        return times;
    }

    public static int minusN(int x, int y) {
        int minus = x - y;
        return minus;
    }

    public static float divideN(float x, float y) {
        float divide = x / y;
        return divide;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        System.out.println("add : " + Exercise172.addN(a, b) + "\n");
        System.out.println("times : " + Exercise172.timesN(a, b) + "\n");
        System.out.println("minus : " + Exercise172.minusN(a, b) + "\n");
        System.out.println("divide : " + Exercise172.divideN(a, b) + "\n");
    }

}
