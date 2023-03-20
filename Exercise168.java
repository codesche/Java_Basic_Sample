

public class Exercise168 {
    public static void main(String[] args) {
        int N = 5;
        System.out.print("1부터 " + N + "까지의 합계 : " + PlusPlus(5));
    }

    public static int PlusPlus(int n) {
        if (n == 0) {
            return 0;
        }

        return n += PlusPlus(n - 1);
    }
}
