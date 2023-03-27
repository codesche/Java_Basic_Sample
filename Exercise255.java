import java.util.Scanner;

public class Exercise255 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int bank = 1000;
        int bet;
        boolean validBet;
        System.out.println("You can bet between 1 and " + bank);
        do {
            System.out.print("Enter your bet: ");
            bet = sc.nextInt();
            validBet = true;

            if ((bet <= 0) || (bet > bank)) {
                validBet = false;
                System.out.println("wrong.");
            }
        } while (!validBet);
    }
}
