

public class Exercise393 {
    public static void main(String[] args) {
        for (Level3 s : Level3.values()) {
            String name = s.name();
            String desc = s.toString();
            int ordinal = s.ordinal();
            int projectedTurnaroundDays = s.getValue();
            double projectedCost = s.getProjectedCost();
            System.out.println("name=" + name + ", description=" + desc
                + ", ordianl=" + ordinal + ", turnaround days="
                + projectedTurnaroundDays + ", projected cost=" + projectedCost);
        }
    }
}

enum Level3 {
    LOW("Low Priority", 30) {
        public double getProjectedCost() {
            return 100.0;
        }
    },

    MEDIUM("Medium Priority", 15) {
        public double getProjectedCost() {
            return 2000.0;
        }
    },

    HIGH("High Priority", 7) {
        public double getProjectedCost() {
            return 3000.0;
        }
    },

    URGENT("Urgent Priority", 1) {
        public double getProjectedCost() {
            return 5000.0;
        }
    };

    private String description;
    private int value;

    private Level3(String description, int a) {
        this.description = description;
        this.value = a;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return this.description;
    }

    public abstract double getProjectedCost();
}
