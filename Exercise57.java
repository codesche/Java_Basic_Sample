import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise57 {
    public static void main(String[] args) {
        File file = new File("text.txt");
        Scanner scan;
        try {
            scan = new Scanner(file);
            while (scan.hasNext()) {
                System.out.println(scan.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
