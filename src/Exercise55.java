import java.io.*;

public class Exercise55 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputList = br.readLine().split("");

        for (int i = 0; i < inputList.length; i++) {
            bw.write(inputList[i]);
        }
        bw.flush();
        bw.close();
    }
}
