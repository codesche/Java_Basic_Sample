

public class Exercise385 {
    public static void main(String[] args) {
        double angle = 30;
        double force = 80;
        int time = 0;

        for (time = 0; time <= 10; time++) {
            double x = Math.cos(Math.toRadians(angle)) * force * time;
            double y = Math.sin(Math.toRadians(angle)) * force * time + -9.8 * .5 * time * time;
            System.out.println(time + "\t(" + x + "," + y + ")");
        }

    }
}
