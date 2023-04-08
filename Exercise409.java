

public class Exercise409 {
    public static void main(String[] args) {
        Float fObj1 = new Float("10.4");
        System.out.println(fObj1);

        String str1 = "1.4";
        Float fObj2 = Float.valueOf(str1);
        System.out.println(fObj2);

        String str2 = "7.9";
        float f = Float.parseFloat(str2);
        System.out.println(f);
    }
}
