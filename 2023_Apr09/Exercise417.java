

public class Exercise417 {
    public static void main(String[] args) {
        int[] v = {0, 1, 2, 3, 4};

        System.out.println("Reference of array u in memory:" + v);
        System.out.println("Value of the 3rd element of array v:" + v[2]);

        int[] t = v;
        System.out.println("Reference of array v in memory:" + v);

        System.out.println(v[2]);
        t[2]++;
        System.out.println(v[2]);
        v[2]++;
        System.out.println(t[2]);
    }
}
