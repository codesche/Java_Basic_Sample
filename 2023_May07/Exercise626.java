import jdk.dynalink.linker.support.SimpleLinkRequest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise626 {
    public static void main(String[] args) {
        String date = "2018-10-18";
        System.out.println(stringConvertDate(date));
    }

    public static Date stringConvertDate(String date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date d = null;
        try {
            d = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return d;
    }

}
