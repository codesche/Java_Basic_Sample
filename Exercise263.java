import java.util.Scanner;

public class Exercise263 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean keepPlaying = true;

        while (keepPlaying) {
            boolean validInput;
            int number, guess;
            String answer;

            number = (int)(Math.random() * 10) + 1;

            System.out.println("A number between 1 and 10.");
            System.out.print("Guess:");
            do {
                guess = sc.nextInt();
                validInput = true;
                if ((guess < 1) || (guess > 10)) {
                    System.out.print("between 1 and 10. Try again: ");
                    validInput = false;
                }
            } while (!validInput);

            if (guess == number) {
                System.out.println("right!");
            } else {
                System.out.println("Wrong: The number was " + number);
            }

            do {
                System.out.println("\nPlay again? (Y or N)");
                answer = sc.next();
                validInput = true;

                if (answer.equalsIgnoreCase("Y")) {
                    keepPlaying = true;
                } else if (answer.equalsIgnoreCase("N")) {
                    keepPlaying = false;
                } else {
                    validInput = false;
                }
            } while (!validInput);
        }

    }
}
