import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise627 {
    public static void main(String[] args) {
        String date = "2018-10-12 01:01:02";
        System.out.println(stringConvertDateTime(date));
    }

    public static Date stringConvertDateTime(String date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date d = null;

        try {
            d = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return d;
    }

}
