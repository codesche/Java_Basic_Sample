import java.util.Scanner;

public class Exercise227 {
    public static void main(String[] args) {
        System.out.print("Input a digit in [0..9]:");
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        switch (n) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("Above three!");
                break;
        }
    }
}
