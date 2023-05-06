import java.util.HashMap;
import java.util.Map;

public class Exercise623 {
    public static void main(String[] args) {
        String allNameValuePairs = "&abc=book2s.com";
        String listDelimiter = ".";
        String nameValueSeparator = "=";
        System.out.println(delimitedToMap(allNameValuePairs, listDelimiter, nameValueSeparator));
    }

    public static Map<String, String> delimitedToMap(String allNameValuePairs,
                                                     String listDelimiter, String nameValueSeparator) {

        HashMap<String, String> params = new HashMap<String, String>();
        if ((allNameValuePairs == null) || (allNameValuePairs.length() == 0)) {
            return params;
        }

        allNameValuePairs = trimFront(allNameValuePairs, listDelimiter);
        return getKeyValue(params, 0, allNameValuePairs,listDelimiter, nameValueSeparator);
    }

    public static String trimFront(String source, String trim) {
        if (source == null) {
            return null;
        }

        if (source.indexOf(trim) == 0) {
            return trimFront(source.substring(trim.length()), trim);
        } else {
            return source;
        }
    }

    public static HashMap<String, String> getKeyValue(
            HashMap<String, String> map, int pos, String allNameValuePairs,
            String listDelimiter, String nameValueSeparator) {

        if (pos >= allNameValuePairs.length()) {
            return map;
        }

        int equalsPos = allNameValuePairs.indexOf(nameValueSeparator, pos);
        int delimPos = allNameValuePairs.indexOf(listDelimiter, pos);

        if (delimPos == -1) {
            delimPos = allNameValuePairs.length();
        }

        if (equalsPos == -1) {
            return map;
        }

        if (delimPos == (equalsPos + 1)) {
            return getKeyValue(map, delimPos + 1, allNameValuePairs,
                    listDelimiter, nameValueSeparator);
        }

        if (equalsPos > delimPos) {
            String key = allNameValuePairs.substring(pos, delimPos);
            key = key.trim();
            if (key.length() > 0) {
                map.put(key, null);
            }
            return getKeyValue(map, delimPos + 1, allNameValuePairs,
                    listDelimiter, nameValueSeparator);
        }

        String key = allNameValuePairs.substring(pos, equalsPos);

        if (delimPos > -1) {
            String value = allNameValuePairs.substring(equalsPos + 1, delimPos);
            key = key.trim();
            map.put(key, value);
            pos = delimPos + 1;

            return getKeyValue(map, pos, allNameValuePairs, listDelimiter, nameValueSeparator);
        } else {
            return map;
        }
    }
}
