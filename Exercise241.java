import java.util.Scanner;

public class Exercise241 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("The car wash application!\n\n");
        System.out.print("Enter the package code: ");
        String s = sc.next();
        char p = s.charAt(0);

        String details = "";

        switch (p) {
            case 'E':
            case 'e':
                details += "E or e\n";

            case 'D':
            case 'd':
                details += "D or d\n";

            case 'C':
            case 'c':
                details += "C or c\n";

            case 'B':
            case 'b':
                details += "B or b\n";

            case 'A':
            case 'a':
                details += "A or a\n";
                break;

            default:
                details = "default.";
                break;
        }
        System.out.println(details);
    }

}
