package pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingString {

    public String matchString(String str, String search){
        String str1 = str;
        String res = "";
        String ser = search;
        Pattern pattern = Pattern.compile(ser);
        Matcher matcher = pattern.matcher(str1);
        while(matcher.find()) {
            System.out.print("found at: "
                    + matcher.start() + "-" + matcher.end());
            res =res+ "found at: " + matcher.start() + "-" + matcher.end() + " ";        }
        res=res.trim();            return res;
    }
}
