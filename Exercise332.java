import java.io.File;
import java.io.IOException;

public class Exercise332 {
    public static void main(String[] args) {
        String filename = "/nosuchdir/myfilename";
        try {
            // Create the file
            new File(filename).createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create " + filename + ": " + e.getMessage());
        }
    }
}
