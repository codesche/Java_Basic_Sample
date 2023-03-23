

public class Exercise215 {
    public static void main(String[] args) {
        int numberOfMarbles;
        int numberOfChildren;
        int marblesPerChild;
        int marblesLeftOver;

        // get the input data
        numberOfMarbles = 50;
        System.out.print("Number of children: ");
        numberOfChildren = 7;

        // calculate the results
        marblesPerChild = numberOfMarbles / numberOfChildren;
        marblesLeftOver = numberOfMarbles % numberOfChildren;

        // print the results
        System.out.println("Give each child " + marblesPerChild + " marbles.");
        System.out.println("You will have " + marblesLeftOver + " marbles left over.");
    }
}
