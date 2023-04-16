import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Exercise487 {
    public static void main(String[] args) {
        HashMap hMap = new HashMap();

        hMap.put("1", "One");
        hMap.put("2", "Two");
        hMap.put("3", "Three");

        Set st = hMap.keySet();

        System.out.println("Set created from HashMap Keys contains : ");

        Iterator itr = st.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        st.remove("2");

        boolean blnExists = hMap.containsKey("2");
        System.out.println("Does HashMap contain 2 ? " + blnExists);
    }
}
