
class Difference {
    private int[] elements;
    public int maximumDifference;

    // parameterized constructor
    public Difference(int[] arr) {
        this.elements = arr;
    }

    public int computeDifference() {
        int max = 0;
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                int diffgap = Math.abs(elements[i] - elements[j]);
                if (diffgap > max) {
                    max = diffgap;
                }
            }
        }
        maximumDifference = max;
        return maximumDifference;
    }
}


public class Exercise359 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = i * i;
        }

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
