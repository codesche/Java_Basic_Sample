import java.util.Scanner;

public class Exercise120 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        int sum;

        System.out.print("첫번째 숫자를 입력하시오: ");
        x = input.nextInt();

        System.out.print("두번째 숫자를 입력하시오: ");
        y = input.nextInt();

        sum = x + y;

        System.out.println(sum);
    }
}
