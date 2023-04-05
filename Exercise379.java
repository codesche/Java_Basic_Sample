import java.io.IOException;

public class Exercise379 {
    public static void main(String[] args) {
        System.out.print("Enter some text and press Enter key: ");
        char c = readChar();
        System.out.println("First character you entered is: " + c);
    }

    public static char readChar() {
        char c = '\u0000';
        int input = 0;
        try {
            input = System.in.read();
            if (input != -1) {
                c = (char) input;
            }
        } catch (IOException e) {
            System.out.print("IOException occurred while reading input.");
        }
        return c;
    }
}
