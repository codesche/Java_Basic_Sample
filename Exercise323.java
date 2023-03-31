import java.io.FileInputStream;
import java.io.IOException;

public class Exercise323 {
    public static void main(String[] args) {
        try {
            Class<?> stringClass = Class.forName("java.lang.String");
            FileInputStream in = new FileInputStream("myFile.log");     // Can throw IOException
            in.read();
        } catch (IOException e) {
            System.out.println("There was an IOException " + e);
        } catch (ClassNotFoundException e) {

        }
    }
}
