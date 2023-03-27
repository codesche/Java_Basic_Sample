

public class Exercise264 {
    public static void main(String[] args) {
        int iter = 1000000;
        int hits = 0;
        for (int i = 0; i < iter; i++) {
            double rX = 2 * Math.random() - 1.0;
            double rY = 2 * Math.random() - 1.0;
            double dist = rX * rX + rY * rY;
            if (dist <= 1.0) {
                hits++;
            }
        }
        double ratio = (double) hits / iter;
        double area = ratio * 4.0;
        System.out.println("Estimation of PI: " + area + "versuslibrary PI " + Math.PI);
    }
}
