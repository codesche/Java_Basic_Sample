import java.util.Scanner;

class ShowName {
    void showName(String name) {
        System.out.println("나는 "  + name + "입니다.");
    }
}

public class Exercise111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력해주세요: ");
        String name = sc.next();

        ShowName myName = new ShowName();
        myName.showName(name);

        sc.close();
    }
}
