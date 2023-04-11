import java.util.ArrayList;

public class Exercise433 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("1");
        arrayList.add("2");

        boolean blnFound = arrayList.contains("2");
        System.out.println("Does arrayList contain 2 ? " + blnFound);

        int index = arrayList.indexOf("4");
        if (index == -1) {
            System.out.println("ArrayList does not contain 4");
        } else {
            System.out.println("ArrayList contains 4 at index :" + index);
        }

        int lastIndex = arrayList.lastIndexOf("1");
        if (lastIndex == -1) {
            System.out.println("ArrayList does not contain 1");
        } else {
            System.out.println("Last occurrence of 1 in ArrayList is at index :");
        }
    }
}
