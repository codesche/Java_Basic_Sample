import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;

public class Exercise99 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> lines = new ArrayList<>();

        // 파일을 읽어 각 라인을 lines에 저장
        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            lines.add(line);
        }
        br.close();

        lines.sort(Comparator.reverseOrder());

        // 정렬된 내용을 result.txt에 저장한다.
        PrintWriter pw = new PrintWriter("result.txt");

        for (String line : lines) {
            pw.println(line);
        }
        pw.close();

    }
}
