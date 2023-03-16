package level1.javaclass.stringandregexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWordDupChar {
    public static final String DUP_CHAR = "(.).*\\1";

    public static void main(String[] args) {
        String[] samples = {"dgbvawq", "m,kl;po", "cbcbcbc", "z_qwertyuiop_z"}; // false, false, true, true
        Pattern pattern = Pattern.compile(DUP_CHAR);

        for (String s : samples) {
            Matcher matcher = pattern.matcher(s);
            System.out.println(matcher.matches());
        }
    }

}
