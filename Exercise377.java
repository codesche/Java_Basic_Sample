

public class Exercise377 {
    public static Integer add(Integer a, Integer b) {
        int aValue = a.intValue();
        int bValue = b.intValue();
        int resultValue = aValue + bValue;
        Integer result = Integer.valueOf(resultValue);
        return result;
    }

    public static void main(String[] args) {
        int iValue = 2;
        int jValue = 3;
        int kValue;

        Integer i = Integer.valueOf(iValue);
        Integer j = Integer.valueOf(jValue);

        Integer k = Exercise377.add(i, j);
        kValue = k.intValue();

        System.out.println(iValue + " + " + jValue + " = " + kValue);
    }
}
