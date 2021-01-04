package projekt.Gyuri;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GyuriTest {

    Munka munka = new Munka();


    @Test
    void palindróma() {
        assertEquals(true ,munka.palindróma("rétipipitér"));
        assertTrue(munka.palindróma("apa "));
        assertFalse(munka.palindróma("pék"));
    }

    @Test
    void kod() {
        assertEquals("<$F$I$A",munka.kod("A k n f"));
    }

    @Test
    void reverseNumber() {
        assertEquals(321,munka.reverseNumber(123));
        assertEquals(0,munka.reverseNumber(0));
        assertEquals(34361,munka.reverseNumber(16343));
        assertNotEquals(32324,munka.reverseNumber(46223));
    }
}