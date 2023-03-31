import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Exercise327 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("out.log")) {
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            DataOutputStream dos = new DataOutputStream(bos);
            dos.writeUTF("This is being written");
            // If an exception occurs here, resources will be handled correctly
            dos.close();
        } catch (Exception e) {
            System.out.println("Some bad exception happened");
        }
    }
}
