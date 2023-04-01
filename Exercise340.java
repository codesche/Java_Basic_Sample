import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exercise340 {
    public static void main(String[] args) {
        try (BufferedReader inputReader = Files.newBufferedReader(
                Paths.get(new URI("file://C:/home/docs/users.txt")),
                Charset.defaultCharset());
             BufferedWriter outputWriter = Files.newBufferedWriter(
                     Paths.get(new URI("file:///C:/home/docs/users.bak")),
                     Charset.defaultCharset())) {
            String inputLine;
            while ((inputLine = inputReader.readLine()) != null) {
                outputWriter.write(inputLine);
                outputWriter.newLine();
            }
            System.out.println("Copy complete!");
        } catch (URISyntaxException | IOException ex) {
            ex.printStackTrace();
        }

    }
}
