package pe4;

public class FrequencyOfCharacter
{
    public int frequencyOfaCharacterFinder(String s) {

        String str = "";

        System.out.println("Length Of String:" + s.length());

        System.out.println("Length Of String Without a :" + s.replace("a", "").length());

        int charcount = s.length() - s.replaceAll("a", "").length();

        System.out.println("Occurrence Of A Char In String: " + charcount);

        return charcount;
    }
}