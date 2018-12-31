package pe4;

import org.junit.Test;

public class TransposeTest {

    private Transpose transpose = new Transpose();

    @Test

    public void stringTranspose() {
        String s1 = transpose.stringTranspose("a quick brown fox jumps over the lazy dog");
        assertTrue("a  kciuq  nworb  xof  spmuj  revo  eht  yzal  god", s1);

    }

    @Test

    public void stringTranspose(){
        String s1= transpose.stringTranspose("welcome to java");
        assertTrue("avaj ot emoclew",s1);
    }

    @Test

    public void stringTranspose(){
        String s1=transpose.stringTranspose("this is java programming");
        assertTrue("siht si avaj gnimmargorp", s1);
    }
}
