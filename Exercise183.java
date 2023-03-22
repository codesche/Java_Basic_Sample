

public class Exercise183 {
    public static void main(String[] args) {
        boolean x = false;

        if (x == true) {
            System.out.println("x is true");
        } else {
            System.out.println("x is false");
        }

        int i = 3;
        int j = 4;

        System.out.println("i=" + i + " j=" + j);

        {
            int ii = 5;
            j++;
            i--;
        }

        System.out.println("i=" + i + " j=" + j);

    }
}
