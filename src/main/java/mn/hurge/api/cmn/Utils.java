package mn.hurge.api.cmn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Utils {

    private Utils() {
        // comment
    }

    public static boolean match(String regex, String value) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);
        return matcher.find();
    }

}
