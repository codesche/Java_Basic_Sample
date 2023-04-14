import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercise475 {
    public static void main(String[] args) {
        List list = new LinkedList<>();
        Object[] objectArray = list.toArray();
        MyClass[] array = (MyClass[]) list.toArray(new MyClass[list.size()]);

        Set set = null;
        objectArray = set.toArray();
        array = (MyClass[]) set.toArray(new MyClass[set.size()]);

        Map map = null;
        objectArray = map.keySet().toArray();
        array = (MyClass[]) map.values().toArray(new MyClass[set.size()]);
    }
}


class MyClass {
}