import java.util.Scanner;

class MaxMin {
    static int max(int num1, int num2, int num3) {
        int max = num1;

        max = max < num2 ? (Math.max(num2, num3)) : (Math.max(max, num3));

        return max;
    }

    static int min(int num1, int num2, int num3) {
        int min = num1;

        min = min > num2 ? (Math.min(num2, num3)) : (Math.min(min, num3));

        return min;
    }

    static void showInfo(int num1, int num2, int num3) {
        System.out.println("최대값: " + max(num1, num2, num3));
        System.out.println("최소값: " + min(num1, num2, num3));
    }

}

public class Exercise112 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 3개를 입력하세요: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        MaxMin.showInfo(num1, num2, num3);
        sc.close();
    }
}
