import java.util.StringTokenizer;

public class Exercise372 {
    public static void main(String[] args) {
        String strLine = "Java Reverse string by word example";
        StringTokenizer st = new StringTokenizer(strLine, " ");

        String strReversedLine = "";

        while (st.hasMoreTokens()) {
            strReversedLine = st.nextToken() + " " + strReversedLine;
        }

        System.out.println("Reversed string by word is : " + strReversedLine);
    }
}
