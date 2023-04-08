

public class Exercise410 {
    public static void main(String[] args) {
        float f = (float) Math.sqrt(-10);
        boolean b1 = Float.isNaN(f);
        System.out.println(b1);

        Float fObj = new Float(f);
        boolean b2 = fObj.isNaN();
        System.out.println(b2);
    }
}
