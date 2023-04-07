import java.util.Arrays;

enum Direction {
    EAST, WEST, NORTH, SOUTH
}

public class Exercise397 {
    public static void main(String[] args) {
        Direction field = Direction.WEST;

        System.out.println("field.name(): " + field.name());
        System.out.println("field.ordinal(): " + field.ordinal());
        System.out.println("field.toString(): " + field.toString());
        System.out.println("field.isEqual(WEST): " + field.equals(Direction.WEST));
        System.out.println("field.isEqual(\"WEST\"'): " + field.equals("WEST"));

        System.out.println("field == WEST: " + (field == Direction.WEST));

        System.out.println("field.compareTo(WEST): " + field.compareTo(Direction.WEST));
        System.out.println("field.compareTo(PASSWORD): " + field.compareTo(Direction.EAST));

        System.out.println("filed.valueOf(\"WEST\"): " + field.valueOf("WEST"));

        System.out.println("FieldType.values(): " + Arrays.toString(Direction.values()));
    }
}
