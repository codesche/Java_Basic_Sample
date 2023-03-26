

public class Exercise251 {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5, 1, 4 };
        float[] array2 = new float[array1.length];

        System.out.print("array1: [ ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println("]");

        System.out.print("array2: [ ");
        int count = 0;

        while (count < array1.length && array1[count] != 1) {
            array2[count] = (float) array1[count];
            System.out.print(array2[count++] + " ");
        }
        System.out.println("]");
    }
}
