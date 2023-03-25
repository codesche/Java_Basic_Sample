import java.util.Scanner;

public class Exercise231 {
    public static void main(String[] args) {
        int total = 0; // sum of grades
        int gradeCounter = 0; // number of grades entered
        int aCount = 0; // count of A grades
        int bCount = 0; // count of B grades
        int cCount = 0; // count of C grades
        int dCount = 0; // count of D grades
        int fCount = 0; // count of F grades

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n   %s%n   %s%n",
                "Enter the integer grades in the range 0-100.",
                "Type the end-of-file indicator to terminate input:",
                "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
                "On Windows type <Ctrl> z then press Enter");

        // loop until user enters the end-of-file indicator
        while (input.hasNext()) {
            int grade = input.nextInt();        // read grade
            total += grade;                     // add grade to total
            ++gradeCounter;                     // increment number of grades

            // increment appropriate letter-grade counter
            switch (grade / 10) {
                case 9:
                case 10:
                    ++aCount;
                    break;

                case 8:
                    ++bCount;
                    break;

                case 7:
                    ++cCount;
                    break;

                case 6:
                    ++dCount;
                    break;

                default:
                    ++fCount;
                    break;
            }
        }

        System.out.printf("%nGrade Report:%n");

        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter;

            // output summary of results
            System.out.printf("Total of the %d grades entered is %d%n",
                    gradeCounter, total);

            System.out.printf("Class average is %.2f%n", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                    "Number of students who received each grade:",
                    "A: ", aCount,   // display number of A grades
                    "B: ", bCount,   // display number of B grades
                    "C: ", cCount,   // display number of C grades
                    "D: ", dCount,   // display number of D grades
                    "F: ", fCount); // display number of F grades
        } else {
            System.out.println("No grades were entered");
        }
    }
}
