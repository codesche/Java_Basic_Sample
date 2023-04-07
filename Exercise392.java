

public class Exercise392 {
    public static void main(String[] args) {
        for (Level2 s : Level2.values()) {
            String name = s.name();
            int ordinal = s.ordinal();
            int days = s.getValue();
            System.out.println("name=" + name + ", ordinal=" + ordinal + ", days=" + days);
        }
    }
}

enum Level2 {
    LOW(30), MEDIUM(15), HIGH(7), URGENT(1);

    private int value;

    private Level2(int a) {
        this.value = a;
    }

    public int getValue() {
        return value;
    }

}
