public class Exercise199 {
    public static void main(String[] args) {
        int i = 10; // w  ww  .  j av  a 2  s. c om
        i = i++ + i;   // Assigns 21 to i
        i = 10;
        i = ++i + i++; // Assigns 22 to i

        System.out.println(i);

        i = 15;
        int j = 16;
        i--;
        --i;
        i = 10;
        i = i--;       // Assigns 10 to i
        i = 10;
        j = i-- + 10;  // Assigns 20 to j and 9 to i
        i = 10;
        j = --i + 10;  // Assigns 19 to j and 9 to i
    }
}
