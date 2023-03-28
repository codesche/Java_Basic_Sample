

public class Exercise266 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + "" + j);

                if (j < 3) {
                    System.out.print("\t");
                }
            }

            if (i < 3) {
                System.out.println();
            }
        }
    }
}
