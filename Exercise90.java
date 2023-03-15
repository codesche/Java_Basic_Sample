import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise90 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("sample.txt", true));
        System.out.print("문장을 입력하세요:");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        pw.println(line);
        pw.close();
    }
}
