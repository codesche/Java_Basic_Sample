

public class Exercise391 {
    public static void main(String[] args) {
        for (Level s : Level.values()) {
            String name = s.name();
            int ordinal = s.ordinal();
            System.out.println(name + "(" + ordinal + ")");
        }
    }
}

enum Level {
    LOW, MEDIUM, HIGH, URGENT;
}
