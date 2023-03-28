import java.util.ArrayList;

public class Exercise275 {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();

        items.add("red");
        items.add(0, "yellow");

        // header
        System.out.println("Display list contents with counter-controlled loop:");

        // display the colors in the list
        for (int i = 0; i < items.size(); i++) {
            System.out.printf("%s ", items.get(i));
        }
    }

    public static void display(ArrayList<String> items, String header) {
        System.out.print(header);

        // display each element in items
        for (String item : items) {
            System.out.printf("  %s", item);
        }
        System.out.println();
    }
}
