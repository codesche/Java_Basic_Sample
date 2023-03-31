import java.io.FileInputStream;
import java.io.IOException;

public class Exercise324 {
    public static void main(String[] args) {
        try {
            Class<?> stringClass = Class.forName("java.lang.String");
            FileInputStream in = new FileInputStream("myFile.log");

            in.read();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An Exception of type " + e.getClass()
                    + " was thrown! " + e);
        }
    }
}
