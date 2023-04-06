

public class Exercise384 {
    public static void main(String[] args) {
        double r = 13;
        double thetha = 22.6;
        double x = 0, y = 0;
        System.out.println(Math.cos(thetha));

        y = Math.sin(thetha) * r;
        x = Math.cos(thetha) * r;

        System.out.println("x value is " + Math.abs(x));
        System.out.println("y value is " + Math.abs(y));
    }
}
