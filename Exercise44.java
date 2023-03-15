import java.util.Scanner;


public class Exercise44 {

    static int max(int a, int b) {
        int res = a;
        if (a < b) {
            res = b;
        }
        return res;
    }

    static int decimal(int a) {
        int cnt = 0;
        for (int i = 0; i < a; i++) {
            if (a % i == 0) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(max(a, b));

        int num = sc.nextInt();
        if (decimal(num) == 1) {
            System.out.println("O");
        } else {
            System.out.println("X");
        }

    }
}
