package pe4;

public class Regex {
    public boolean checkRegex(String str1,String word)
    {
        if(str1.matches("(.*)Harry(.*)"))
        {
            return true;
        }
   else
        {
            return false;
        }
    }
}
