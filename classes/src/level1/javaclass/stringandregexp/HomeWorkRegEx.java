package level1.javaclass.stringandregexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWorkRegEx {
    public static final String IPV4_REGEX = "\\A(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}\\z";

    public static void main(String[] args) {
        String[] str = {"192.168.0.1", "10.144.58.10", "3.3.3.3", "5.l.7.8", "8.8.8.8"};

        for (String s : str) {
            System.out.println(s + " - " + checkIpv4(s));
        }
    }

    public static boolean checkIpv4(String str) {
        Pattern pattern = Pattern.compile(IPV4_REGEX);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
