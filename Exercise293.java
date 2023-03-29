import java.util.Scanner;

public class Exercise293 {
    public static void main(String[] args) {
        int count = 10;
        String[] players = new String[count];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < count; i++) {
            System.out.print("Enter player name: ");
            players[i] = sc.nextLine();
        }

    }
}
