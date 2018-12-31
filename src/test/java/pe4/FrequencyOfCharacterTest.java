package pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class FrequencyOfCharacterTest
{
    FrequencyOfCharacter frequencyOfCharacter=new FrequencyOfCharacter();


@Test
    public void test1()
{
    assertEquals("occurence of letter a in a string", 4, frequencyOfCharacter.frequencyOfaCharacterFinder("javaaa"));

}

    @Test
    public void test2()
    {
        assertEquals("occurence of letter a in a string", 10, frequencyOfCharacter.frequencyOfaCharacterFinder("Java is java again java again"));

    }
}
