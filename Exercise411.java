import java.util.Arrays;

public class Exercise411 {
    public static void main(String[] args) {
        float[] floatArray1 = new float[]{9.4f, 3.4f, 5.1f};
        float[] floatArray2 = new float[]{9.4f, 3.4f, 5.1f};

        boolean blnResult = Arrays.equals(floatArray1, floatArray2);
        System.out.println("Are two float arrays equal ? : " + blnResult);
    }
}
