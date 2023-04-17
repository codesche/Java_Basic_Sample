import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Exercise491 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        Map map = Collections.synchronizedMap(hashMap);

        System.out.println("done");
    }
}
