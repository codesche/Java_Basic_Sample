

public class Exercise389 {
    public static void main(String[] args) {
        int[] x = {95, 85, 80, 70, 60};
        int[] y = {85, 95, 70, 65, 70};
        double studentScore = 80;

        double b = pearson(x, y) * (standardDeviation(y) / standardDeviation(x));
        double a = getMean(y) - b * getMean(x);

        double result = a + b * studentScore;
        System.out.printf("%.3f", result);
    }

    private static Double pearson(int[] xs, int[] ys) {
        if (xs == null || ys == null || xs.length != ys.length) {
            return null;
        }
        double xMean = getMean(xs);
        double yMean = getMean(xs);
        int n = xs.length;

        double numerator = 0;
        for (int i = 0; i < n; i++) {
            numerator += (xs[i] - xMean) * (ys[i] - yMean);
        }
        return numerator / (n * standardDeviation(xs) * standardDeviation(ys));
    }

    private static Double getMean(int[] array) {
        if (array == null) {
            return null;
        }
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return (double) total / array.length;
    }

    private static Double standardDeviation(int[] array) {
        if (array == null) {
            return null;
        }
        double mean = getMean(array);
        int sum = 0;
        for (double x : array) {
            sum += Math.pow(x - mean, 2);
        }
        double variance = sum / array.length;
        return Math.sqrt(variance);
    }

}
