import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Exercise521 {
    public static void main(String[] args) throws Exception {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "first");
        map.put(2, "second");
        Map<Number, String> numMap = new HashMap<Number, String>();

        numMap.put(.5, "half");
        numMap.put(1, "first");
        map.put(null, null);
        Map<String, URL> urlMap = new HashMap<String, URL>();

        try {
            urlMap.put("java", new URL("http://java2s.com"));
        } catch (MalformedURLException e) {

        }
        String s = urlMap.get("java").getHost();
    }
}
