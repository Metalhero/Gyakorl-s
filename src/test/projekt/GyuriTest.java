package projekt;

import org.junit.jupiter.api.Test;
import projekt.Gyuri.Munka;

import static org.junit.jupiter.api.Assertions.*;

class GyuriTest {

    Munka testMunka=new Munka();

    @Test
    public void testfgv() {
        String expected="test";
        String result=testMunka.testfgv();
        assertEquals(expected,result);
    }

}