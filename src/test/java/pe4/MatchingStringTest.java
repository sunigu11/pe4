package pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatchingStringTest {

    MatchingString matchingString = null;



    @Before
    public void setUp() throws Exception {
        matchingString = new MatchingString();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void matchString1() {
        //act
        String expected = "found at: 4-6 found at: 10-12 found at: 27-29";
        //arrange
        String result = matchingString.matchString("She sells seashells by the seashore","se");
        //assert
        assertEquals(expected,result);
    }

    @Test
    public void matchString2() {
        //act
        String expected = "found at: 2-4 found at: 5-7 found at: 23-25";
        //arrange
        String result = matchingString.matchString("This is the text which is to be searched","is");
        //assert
        assertEquals(expected,result);
    }
}