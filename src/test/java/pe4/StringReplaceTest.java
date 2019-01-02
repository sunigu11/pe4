package pe4;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StringReplaceTest {
    StringReplace stringreplace = new StringReplace();

    private void stringreplace(String str) {

    }

    @Test
    public void test1() {
        String result = stringreplace.doReplace("daily dry");
        assertEquals("faity fry", result);
    }
    @Test
    public void test2() {
        String result = stringreplace.doReplace("dear welcome");
        assertEquals("fear ", result);
    }
}