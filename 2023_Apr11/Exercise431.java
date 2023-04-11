import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise431 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        List list = Collections.synchronizedList(arrayList);
    }
}
