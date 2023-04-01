import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Exercise333 {
    public static void main(String[] args) {
        // This URL string is deliberately missing the http: protocol to cause an
        // exception
        String urlStr = "xeo.com:90/register.jsp?name=joe";
        try {
            // Get the image
            URL url = new URL(urlStr);
            InputStream is = url.openStream();
            is.close();
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL " + urlStr + ": " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Unable to execute " + urlStr + ": " + e.getMessage());
        }
    }
}
