import java.util.Scanner;

public class Exercise171 {

    public static void method1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");           // 버퍼라는 곳에 저장
        String name = sc.nextLine();                     // 버퍼에 있는 것을 메소드를 통해 저장

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("성별을 입력하세요(남/여) : ");
        char gender = sc.nextLine().charAt(0);

        System.out.print("키를 입력하세요(cm) : ");
        double height = sc.nextDouble();

        System.out.println("키 " + height + "인 " + age + "살 "
                + gender + "자 " + name + "님 반갑습니다^^");

    }


    public static void main(String[] args) {
        method1();
    }
}
