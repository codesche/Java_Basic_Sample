

public class Exercise217 {
    public static void main(String[] args) {
        int i = 5;
        int j = 10;
        int k = 15;
        double x = 5.0;
        double y = 7.5;
        double z = 12.3;

        System.out.println(i == 5); // true The value of iis 5.
        System.out.println(i == 10); // false The value of iis not 10.
        System.out.println(i == j); // false iis 5, and j is 10, so they are not equal.
        System.out.println(i == j - 5); // true iis 5, and j - 5 is 5.
        System.out.println(i > 1); // true iis 5, which is greater than 1.
        System.out.println(j == i * 2); // true j is 10, and iis 5, so i * 2is also 10.
        System.out.println(x = i); // true Casting allows the comparison, and 5.0is equal to 5.
        System.out.println(k < z); // false Casting allows the comparison, and 15is greater than 12.3.
        System.out.println(i * 2 < y); // false i * 2is 10, which is not less than 7.5.

    }
}
