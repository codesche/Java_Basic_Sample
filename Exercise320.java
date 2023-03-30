import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise320 {
    public static void main(String[] args) {
        try {
            writeFile(new BufferedWriter(new FileWriter("test")),
                    "This is easy in Java 9");
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    public static void writeFile(BufferedWriter writer, String text) {
        try (writer) {
            writer.write(text);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

}
