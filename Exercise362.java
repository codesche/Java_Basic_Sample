

public class Exercise362 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        printDetails(sb);

        sb.append("blessings");
        printDetails(sb);

        sb.insert(0, "Good ");
        printDetails(sb);

        sb.deleteCharAt(1);
        printDetails(sb);

        sb.append(" test test test");
        printDetails(sb);

        // Set the length to 3
        sb.setLength(3);
        printDetails(sb);

        // Reverse the content
        sb.reverse();
        printDetails(sb);
    }

    public static void printDetails(StringBuilder sb) {
        System.out.println("Content: \"" + sb + "\"");
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

        System.out.println();
    }

}
