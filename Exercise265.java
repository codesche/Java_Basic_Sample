

public class Exercise265 {
    public static void main(String[] args) {
        int i, n = 10;
        int cumulLoop = 0;
        for (i = 0; i < n; i++) {
            cumulLoop += i;
        }
        int cumul = (n * (n - 1)) / 2;
        System.out.println(cumulLoop + " closed-form:" + cumul);
    }
}
