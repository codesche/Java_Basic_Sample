import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Exercise334 {
    public static void main(String[] args) {
        String urlStr = "httpasdf://xeo.com:90/register.jsp?name=joe";
        try {
            URL url = new URL(urlStr);
            InputStream is = url.openStream();
            is.close();
        } catch (MalformedURLException e) {
            // Print out the exception that occurred
            System.out.println("Invalid URL " + urlStr + ": " + e.getMessage());
        } catch (IOException e) {
            // Print out the exception that occurred
            System.out.println("Unable to execute " + urlStr + ": " + e.getMessage());
        }
    }
}
