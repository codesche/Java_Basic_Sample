import java.util.Scanner;

public class Exercise142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("총 금액 입력 : ");
        int money = sc.nextInt();
        System.out.println();

        System.out.println("잔돈 : " + money + "원");
        int man = money / 10000;
        int ochen = (money % 10000) / 5000;
        int chen = (money % 10000) % 5000 / 1000;
        int obaek = (money % 10000) % 5000 % 1000 / 500;
        int baek = (money % 10000) % 5000 % 1000 % 500 / 100;

        System.out.println("10000원 : " + man + "장");
        System.out.println("5000원 : " + ochen + "장");
        System.out.println("1000원 : " + chen + "장");
        System.out.println("5000원 : " + obaek + "장");
        System.out.println("100원 : " + baek + "장");
    }
}
