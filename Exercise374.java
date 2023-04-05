import java.util.Scanner;

public class Exercise374 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int val;
        System.out.print("Enter an integer please:");
        val = keyboard.nextInt();
        val *= val;
        System.out.println("Squared value=" + val);
    }
}
