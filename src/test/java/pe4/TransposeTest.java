package pe4;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TransposeTest {
     Transpose transpose = new Transpose();

    @Test

    public void stringTranspose1() {
        String s1 = transpose.setStringVar("a quick brown fox jumps over the lazy dog");
        assertEquals("a  kciuq  nworb  xof  spmuj  revo  eht  yzal  god", s1);

    }

    @Test

    public void stringTranspose2(){
        String s1= transpose.setStringVar("welcome to java");
        assertEquals("avaj ot emoclew",s1);
    }

    @Test

    public void stringTranspose3(){
        String s1=transpose.setStringVar("this is java programming");
        assertEquals("siht si avaj gnimmargorp", s1);
    }
}


