

public class Exercise353 {
    public static void main(String[] args) {
        double a = 1.0d;
        double b = 3.14d;
        double c = a + b;

        if (c == 4.14) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect. I branched on the wrong block!!!");
            System.out.println("a=" + a + " b=" + b + " a+b=c=" + c);
        }
    }
}
