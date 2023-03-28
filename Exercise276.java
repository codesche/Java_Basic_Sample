import java.util.ArrayList;

public class Exercise276 {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<String>();

        items.add("red");
        items.add(0, "yellow");

        display(items, "%nDisplay list contents with enhanced for statement: ");

        items.add("green");
        items.add("yellow");
        display(items, "items, List with two new elements: ");
    }

    public static void display(ArrayList<String> items, String header) {
        System.out.print(header);

        for (String item : items) {
            System.out.printf("%s ", item);
        }
        System.out.println();
    }

}
