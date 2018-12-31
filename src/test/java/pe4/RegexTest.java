package pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegexTest
{
    Regex regex=new Regex();
     @Test
    public void checkRegex1()
    {
        String word="Harry";
        String str1="This is Harry";
              boolean result=regex.checkRegex(str1,word);

              assertEquals("true",result);
    }


    @Test
    public void checkRegex2()
    {
        String word="Harry";
        String str1="This is Henry";
        boolean result=regex.checkRegex(str1,word);

        assertEquals("false",result);
    }



    @Test
    public void checkRegex3()
    {
        String word="Harry";
        String str1="Welcome back to palace, Henry";
        boolean result=regex.checkRegex(str1,word);

        assertEquals("false",result);
    }



}