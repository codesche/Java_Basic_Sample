import java.util.Scanner;

public class Exercise242 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the error code: ");
        int err = sc.nextInt();

        String msg;

        switch (err) {
            case 1:
                msg = "1.";
                break;
            case 2:
                msg = "2.";
                break;
            case 3:
                msg = "3.";
                break;
            case 4:
                msg = "4.";
                break;
            case 5:
                msg = "5.";
                break;
            case 6:
                msg = "6.";
                break;
            case 7:
                msg = "7.";
                break;
            default:
                msg = "8.";
                break;
        }
        System.out.println(msg);
    }
}
