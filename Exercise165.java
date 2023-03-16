import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercise165 {
    public static void main(String[] args) {
        Set<String> cars = new HashSet<>();
        cars.add("벤츠");
        cars.add("람보르기니");
        cars.add("롤스로이스");
        cars.add("페라리");

        // while문을 사용한 경우
        Iterator<String> iterator = cars.iterator();

        while (iterator.hasNext()) {
            System.out.println("cars : " + iterator.next());
        }

        // for-each문을 사용한 경우
        for (String car : cars) {
            System.out.println("cars : " + car);
        }

    }
}
