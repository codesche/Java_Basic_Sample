

public class Exercise277 {
    public static void main(String[] args) {
        int[] a1 = { 1_900_000, 1_700_000, 1_700_000 };
        int[] a2 = { 1_900_000, 1_800_000, 1_750_000 };
        int[] total = new int[a1.length];
        int sum = 0;

        for (int i = 0; i < a1.length; i++) {
            total[i] = a1[i] + a2[i];
            System.out.format((i + 2009) + " production: %,d%n", total[i]);
            sum += total[i];
        }

        System.out.format("Average production: %,d%n", (sum / a1.length));
    }
}
