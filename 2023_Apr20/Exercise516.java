import java.util.List;
import java.util.Map;

public class Exercise516 {
    public static void main(String[] args) {
        List<String> jvmLanguages = List.of("Java", "Scala", "JRuby", "Groovy", "Jython", "Kotlin");
        System.out.println(jvmLanguages);

        try {
            jvmLanguages.add("Exception");
        } catch (UnsupportedOperationException uoe) {
            System.out.println(uoe);
        }

        Map<Integer, String> players = Map.of(1, "Ana Betes", 2,
                "Lady Mary", 3, "William Wang", 4, "Corus Nee");

        System.out.println(players.values());
        System.out.println("Player 2: " + players.get(2));
    }
}
