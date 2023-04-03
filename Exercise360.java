

public class Exercise360 {

    public static boolean consecutiveNumber(int arr[]) {
        int i, j;
        boolean flag = false;
        for (i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i] - arr[i + 1]) == 1) {
                System.out.println("Compare: " + "arr[i+1]: " + arr[i + 1] + " arr[i] :" + arr[i]);
                flag = true;
            } else {
                System.out.println("False " + "arr[i+1]: " + arr[i + 1] + " arr[i] : " + arr[i]);
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] Array = new int[]{1, 2, 3};

        boolean result = consecutiveNumber(Array);
        if (result == true) {
            System.out.print("True");
        } else {
            System.out.print("false");
        }
    }
}
