package pe4;

import static org.junit.Assert.*;

public class FrequencyOfCharacterTest {
    public void frequencyOfaCharacterFinder(String s)
    {
        String str="";
        System.out.println("Length Of String:" + str.length());
        System.out.println("Length Of String Without a :" + str.replace("a", "").length());
        int charcount = str.length() - str.replaceAll("a", "").length();
        System.out.println("Occurrence Of A Char In String: " + charcount);
    }

}