package pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class TextSortTest {

    TextSort textSort = null;

    @Before
    public void setUp() throws Exception {
        textSort = new TextSort();
    }

    @After
    public void tearDown() throws Exception {
        textSort = null;
    }


    @Test
    public void sorttText1(){
        String expected = "given line please sort this to you";
        String result = textSort.sorttText("please sort this line given to you");
        assertEquals(expected,result);
    }

    @Test
    public void sorttText2(){
        String expected = "are doing hello what you ";
        String result = textSort.sorttText("hello what are you doing");
        assertEquals(expected,result);
    }

}