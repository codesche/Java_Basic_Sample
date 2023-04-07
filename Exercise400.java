
enum Day2 {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}


public class Exercise400 {
    Day2 day2;

    public Exercise400(Day2 day2) {
        this.day2 = day2;
    }

    public void tellItLikeItIs() {
        switch (day2) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;

            case FRIDAY:
                System.out.println("Fridays are better.");
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;

            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    public static void main(String[] args) {
        Exercise400 firstDay = new Exercise400(Day2.MONDAY);
        firstDay.tellItLikeItIs();
        Exercise400 thirdDay = new Exercise400(Day2.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        Exercise400 fifthDay = new Exercise400(Day2.FRIDAY);
        fifthDay.tellItLikeItIs();
        Exercise400 sixthDay = new Exercise400(Day2.SATURDAY);
        sixthDay.tellItLikeItIs();
        Exercise400 seventhDay = new Exercise400(Day2.SUNDAY);
        seventhDay.tellItLikeItIs();
    }
}
