
// 시러큐스의 추측
public class Exercise260 {
    public static void main(String[] args) {
        int n = 13;
        do {
            if ((n % 2) == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        } while (n > 1);
        System.out.println(n);
    }
}
