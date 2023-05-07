import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise629 {
    public static void main(String[] args) {
        String str = "2019/01/01";
        System.out.println(StringToDate(str));
    }

    public static Date StringToDate(String str) {
        Date date = null;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        try {
            date = formatter.parse(str);
        } catch (ParseException e) {
            throw new IllegalArgumentException(
                    "Wrong date format. Use yyyy/mm/dd.");
        }
        return date;
    }

}
