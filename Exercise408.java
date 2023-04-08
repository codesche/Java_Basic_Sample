

public class Exercise408 {
    public static void main(String[] args) {
        float f1 = 5.5f;
        float f2 = 5.4f;
        int i1 = Float.compare(f1, f2);

        if (i1 > 0) {
            System.out.println("First is greater");
        } else if (i1 < 0) {
            System.out.println("Second is greater");
        } else {
            System.out.println("Both are equal");
        }

        Float fObj1 = new Float("5.5");
        Float fObj2 = new Float("5.4");
        int i2 = fObj1.compareTo(fObj2);

        if (i2 > 0) {
            System.out.println("First is greater");
        } else if (i2 < 0) {
            System.out.println("Second is greater");
        } else {
            System.out.println("Both are equal");
        }
    }
}
