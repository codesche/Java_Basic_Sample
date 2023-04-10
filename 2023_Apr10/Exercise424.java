import java.util.ArrayList;

public class Exercise424 {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<String>();

        items.add("red");
        items.add(0, "yellow");

        items.remove(1);
        display(items, "Remove second list element (green):");
    }

    public static void display(ArrayList<String> items, String header) {
        System.out.print(header);

        for (String item : items) {
            System.out.printf(" %s", item);
        }

        System.out.println();
    }
}
