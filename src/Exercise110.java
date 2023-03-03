import java.util.Scanner;

class Calc {
    static int sum(int num1, int num2) {
        return num1 + num2;
    }
}

public class Exercise110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 2개를 입력해주세요");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("정수의 합: " + Calc.sum(num1, num2));
        sc.close();
    }
}
